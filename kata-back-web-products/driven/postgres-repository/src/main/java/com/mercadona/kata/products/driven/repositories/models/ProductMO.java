package com.mercadona.kata.products.driven.repositories.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProductMO {
  @Id
  private Integer id;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private Float price;

  @Column(nullable = false)
  private Integer calories;

  @Column(nullable = false)
  private String category;

  @Column(nullable = false)
  private Boolean available;

  @Column(nullable = false)
  private Integer providerId;
}
