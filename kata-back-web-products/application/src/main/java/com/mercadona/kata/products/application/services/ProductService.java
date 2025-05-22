package com.mercadona.kata.products.application.services;

import com.mercadona.kata.products.application.ports.driven.ProductRepositoryPort;
import com.mercadona.kata.products.application.ports.driving.ProductServicePort;
import com.mercadona.kata.products.domain.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductService implements ProductServicePort {

  private final ProductRepositoryPort repositoryService;

  @Override
  public Product createProduct(Integer providerId, Product product) {
    return repositoryService.createProduct(providerId, product);
  }

  @Override
  public void deleteProduct(Integer providerId, Integer productId) {
    repositoryService.deleteProduct(providerId, productId);
  }

  @Override
  public Product getProduct(Integer providerId, Integer productId) {
    return repositoryService.getProduct(providerId, productId);
  }
}
