package com.mercadona.kata.providers.driven.repositories.mappers;

import com.mercadona.kata.providers.domain.Provider;
import com.mercadona.kata.providers.driven.repositories.models.ProviderMO;
import org.mapstruct.Mapper;

@Mapper
public interface ProviderRepositoryMapper{
  Provider toDomain(ProviderMO providerMO);
  ProviderMO toMO (Provider provider);
}
