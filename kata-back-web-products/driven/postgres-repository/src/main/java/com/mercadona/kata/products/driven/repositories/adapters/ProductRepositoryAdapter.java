package com.mercadona.kata.products.driven.repositories.adapters;

import com.mercadona.kata.products.application.ports.driven.ProductRepositoryPort;
import com.mercadona.kata.products.application.ports.driving.ProductServicePort;
import com.mercadona.kata.products.domain.Product;
import com.mercadona.kata.products.driven.repositories.ProductJpaRepository;
import com.mercadona.kata.products.driven.repositories.mappers.ProductRepositoryMapper;
import com.mercadona.kata.products.driven.repositories.models.ProductMO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductRepositoryAdapter implements ProductRepositoryPort {

  private final ProductJpaRepository repository;
  private final ProductRepositoryMapper mapper;

  @Override
  public Product createProduct(Integer providerId, Product product) {
    ProductMO productMO = mapper.toProductMO(product);
    productMO.setProviderId(providerId);
    return mapper.toDomain(repository.save(productMO));
  }

  @Override
  public void deleteProduct(Integer providerId, Integer productId) {
    repository.deleteById(productId);
  }

  @Override
  public Product getProduct(Integer providerId, Integer productId) {
    return mapper.toDomain(repository.getProductMOById(productId));
  }
}
