package com.mercadona.kata.providers.driven.repositories.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class ProviderMO {
  @Id
  private Integer id;
  @Column(nullable = false)
  private String name;
  @Column(nullable = false)
  private String city;
  @Column(nullable = false)
  private String postalCode;
  @Column(nullable = false)
  private String address;
  @Column(nullable = false, unique = true)
  private String nif;
}
