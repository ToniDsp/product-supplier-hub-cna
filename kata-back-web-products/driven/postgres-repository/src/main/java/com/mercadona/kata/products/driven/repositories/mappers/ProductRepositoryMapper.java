package com.mercadona.kata.products.driven.repositories.mappers;

import com.mercadona.kata.products.domain.Product;
import com.mercadona.kata.products.driven.repositories.models.ProductMO;
import org.mapstruct.Mapper;

@Mapper
public interface ProductRepositoryMapper {
  Product toDomain(ProductMO productMO);
  ProductMO toProductMO(Product product);
}
