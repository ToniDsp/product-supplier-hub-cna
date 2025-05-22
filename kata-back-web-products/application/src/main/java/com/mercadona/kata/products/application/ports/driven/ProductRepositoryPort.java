package com.mercadona.kata.products.application.ports.driven;

import com.mercadona.kata.products.domain.Product;
import org.springframework.stereotype.Service;


public interface ProductRepositoryPort {

  Product createProduct(Integer providerId, Product product);
  void deleteProduct(Integer providerId, Integer productId);
  Product getProduct(Integer providerId, Integer productId);
}
