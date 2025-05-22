package com.mercadona.kata.products.driving.controllers.mappers;

import com.example.model.ProductRequest;
import com.example.model.ProductResponse;
import com.mercadona.kata.products.domain.Product;
import org.mapstruct.Mapper;

@Mapper
public interface ProductControllerMapper {
  Product toDomain(ProductRequest productRequest);
  ProductResponse toResponse(Product product);
}
