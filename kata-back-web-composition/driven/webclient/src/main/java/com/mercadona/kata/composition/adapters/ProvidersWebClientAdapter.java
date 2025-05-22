package com.mercadona.kata.composition.adapters;

import com.mercadona.kata.composition.application.ports.driven.ProviderPort;
import com.mercadona.kata.composition.domain.Provider;
import com.mercadona.kata.composition.mappers.ProvidersWebClientMapper;
import com.providers.example.client.ApiClient;
import com.providers.example.client.api.ProvidersApi;
import com.providers.example.client.model.ProviderResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ProvidersWebClientAdapter extends ProvidersApi implements ProviderPort {

  private final ProvidersWebClientMapper mapper;

  public ProvidersWebClientAdapter(@Value("localhost:8081") String baseUrl, ProvidersWebClientMapper mapper) {
    this.mapper = mapper;
    super.setApiClient(new ApiClient(WebClient.builder().baseUrl(baseUrl).build()));
  }

  @Override
  public Provider getProviderById(Integer providerId){
    ProviderResponse providerResponse = super.getProviderById(providerId).block();
    return mapper.toDomain(providerResponse);
  }

  @Override
  public Provider createProvider(Provider provider) {
    ProviderResponse provideRresponse = super.createProvider(mapper.toRequest(provider)).block();
    return mapper.toDomain(provideRresponse);
  }
}
