package com.mercadona.kata.composition.mappers;

import com.mercadona.kata.composition.domain.Provider;
import com.providers.example.client.model.ProviderRequest;
import com.providers.example.client.model.ProviderResponse;
import org.mapstruct.Mapper;

@Mapper
public interface ProvidersWebClientMapper {
  Provider toDomain(ProviderResponse providerResponse) ;
  ProviderRequest toRequest(Provider provider);
}
