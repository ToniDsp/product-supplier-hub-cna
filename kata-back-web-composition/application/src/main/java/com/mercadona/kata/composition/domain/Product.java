package com.mercadona.kata.composition.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Product {
  private Long id;
  private String name;
  private Float price;
  private Integer calories;
  private String category;
  private Boolean available;
}
