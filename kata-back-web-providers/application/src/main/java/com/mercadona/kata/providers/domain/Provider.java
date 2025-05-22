package com.mercadona.kata.providers.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Provider {
  private Integer id;
  private String name;
  private String city;
  private String postalCode;
  private String address;
  private String nif;
}
