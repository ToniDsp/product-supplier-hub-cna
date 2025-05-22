package com.mercadona.kata.products.driving.controllers.adapters;

import com.example.api.ProductsApi;
import com.example.model.ProductRequest;
import com.example.model.ProductResponse;
import com.mercadona.kata.products.application.ports.driving.ProductServicePort;
import com.mercadona.kata.products.driving.controllers.mappers.ProductControllerMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class ProductControllerAdapter implements ProductsApi {

  private final ProductControllerMapper mapper;
  private final ProductServicePort service;

  @Override
  public ResponseEntity<ProductResponse> createProduct(Integer id, ProductRequest productRequest) {
    return new ResponseEntity<>(mapper.toResponse(service.createProduct(id, mapper.toDomain(productRequest))), HttpStatus.CREATED);
  }

  @Override
  public ResponseEntity deleteProduct(Integer id, Integer productId) {
    service.deleteProduct(id, productId);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }

  @Override
  public ResponseEntity<ProductResponse> getProduct(Integer id, Integer productId) {
    return new ResponseEntity<>(mapper.toResponse(service.getProduct(id, productId)), HttpStatus.OK);
  }
}
