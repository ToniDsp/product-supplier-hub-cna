package com.mercadona.kata.composition.driving.controllers.adapters;


import com.example.api.ProductsApi;
import com.example.model.ProductRequest;
import com.example.model.ProductResponse;
import com.mercadona.kata.composition.application.ports.driving.ProductsServicePort;
import com.mercadona.kata.composition.driving.controllers.mappers.ProductControllerMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class ProductControllerAdapter implements ProductsApi {
  private final ProductsServicePort productsService;
  private final ProductControllerMapper mapper;


  @Override
  public ResponseEntity<ProductResponse> createProductInBd(Integer id, ProductRequest product) {
    ProductResponse productResponse = mapper.toResponse(productsService.createProduct(id, mapper.toDomain(product)));
    return new ResponseEntity<>(productResponse, HttpStatus.CREATED);
  }

  @Override
  public ResponseEntity<Void> deleteProduct(Integer id, Integer productId) {
    productsService.deleteProduct(id, productId);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @Override
  public ResponseEntity<ProductResponse> getProduct(Integer id, Integer productId) {
    ProductResponse productResponse = mapper.toResponse(productsService.getProductById(id, productId));
    return new ResponseEntity<>(productResponse, HttpStatus.OK);
  }
}
