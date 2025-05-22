package com.mercadona.kata.composition.mappers;

import com.mercadona.kata.composition.domain.Product;
import com.product.example.client.model.ProductRequest;
import com.product.example.client.model.ProductResponse;
import org.mapstruct.Mapper;

@Mapper
public interface ProductWebClientMapper {

  Product toDomain(ProductResponse productResponse);
  ProductRequest toRequest(Product product);
}
