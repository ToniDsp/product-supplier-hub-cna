package com.mercadona.kata.products.application.ports.driving;

import com.mercadona.kata.products.domain.Product;
import org.springframework.stereotype.Service;

public interface ProductServicePort {

  Product createProduct(Integer providerId,Product product);

  void deleteProduct(Integer providerId, Integer productId);

  Product getProduct(Integer providerId, Integer productId);

}
