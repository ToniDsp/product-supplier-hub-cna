package com.mercadona.kata.composition.application.ports.driven;

import com.mercadona.kata.composition.domain.Product;

public interface ProductMicroPort {
  Product createProductInBd(Integer id, Product product);
  void deleteProductById(Integer id, Integer productId);
  Product getProductById(Integer id, Integer productId);

}
