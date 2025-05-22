package com.mercadona.kata.products.driven.repositories;

import com.mercadona.kata.products.driven.repositories.models.ProductMO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJpaRepository extends JpaRepository<ProductMO, Integer> {


  ProductMO getProductMOById(Integer productId);
}
