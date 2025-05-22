package com.mercadona.kata.providers.driving.controllers.mappers;

import com.example.model.ProviderRequest;
import com.example.model.ProviderResponse;
import com.mercadona.kata.providers.domain.Provider;
import org.mapstruct.Mapper;

@Mapper
public interface ProvidersControllerMapper {
  ProviderResponse toResponse(Provider provider);
  Provider toDomain(ProviderRequest providerRequest);
}
