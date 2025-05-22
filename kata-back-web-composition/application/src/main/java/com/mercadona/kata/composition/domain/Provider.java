package com.mercadona.kata.composition.domain;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Provider {
  private Integer id;
  private String name;
  private String city;
  private String postalCode;
  private String address;
  private String nif;
}
