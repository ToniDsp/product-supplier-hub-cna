package com.mercadona.kata.composition.application.services;

import com.mercadona.kata.composition.application.ports.driven.ProductPort;
import com.mercadona.kata.composition.domain.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductsService {

  private final ProductPort productMicroPort;

  public Product createProduct(Integer id, Product product) {
    return productMicroPort.createProductInBd(id, product);
  }


  public void deleteProduct(Integer providerId, Integer productId) {
    productMicroPort.deleteProductById(providerId, productId);
  }


  public Product getProductById(Integer id, Integer productId) {
    return productMicroPort.getProductById(id, productId);
  }
}
