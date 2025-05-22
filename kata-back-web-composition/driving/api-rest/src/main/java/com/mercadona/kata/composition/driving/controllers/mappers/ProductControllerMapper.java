package com.mercadona.kata.composition.driving.controllers.mappers;

import com.example.model.ProductRequest;
import com.example.model.ProductResponse;
import com.mercadona.kata.composition.domain.Product;
import org.mapstruct.Mapper;

@Mapper
public interface ProductControllerMapper {
  ProductResponse toResponse(Product product);
  Product toDomain(ProductRequest productRequest);
}
