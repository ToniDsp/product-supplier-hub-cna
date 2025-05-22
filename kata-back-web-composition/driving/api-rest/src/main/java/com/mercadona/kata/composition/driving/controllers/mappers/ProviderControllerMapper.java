package com.mercadona.kata.composition.driving.controllers.mappers;

import com.example.model.ProviderRequest;
import com.example.model.ProviderResponse;
import com.mercadona.kata.composition.domain.Provider;
import org.mapstruct.Mapper;

@Mapper
public interface ProviderControllerMapper {
  Provider toDomain(ProviderRequest providerRequest);
  ProviderResponse toResponse(Provider provider);
}
