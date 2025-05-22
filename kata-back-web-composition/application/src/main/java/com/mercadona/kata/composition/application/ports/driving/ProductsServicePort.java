package com.mercadona.kata.composition.application.ports.driving;


import com.mercadona.kata.composition.domain.Product;
import org.springframework.stereotype.Service;

public interface ProductsServicePort {
  Product createProduct(Integer id, Product product);

  void deleteProduct(Integer providerId,Integer productId);

  Product getProductById(Integer id, Integer productId);
}
