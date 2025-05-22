package com.mercadona.kata.products.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {
  private Integer id;
  private String name;
  private Float price;
  private Integer calories;
  private String category;
  private Boolean available;
  private Integer providerId;
}
