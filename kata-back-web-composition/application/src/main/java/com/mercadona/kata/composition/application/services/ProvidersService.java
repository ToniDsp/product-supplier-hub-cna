package com.mercadona.kata.composition.application.services;

import com.mercadona.kata.composition.application.ports.driven.ProviderPort;
import com.mercadona.kata.composition.application.ports.driving.ProvidersServicePort;
import com.mercadona.kata.composition.domain.Provider;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProvidersService implements ProvidersServicePort {

  private final ProviderPort providersPort;

  @Override
  public Provider createProvider(Provider provider) {
    return providersPort.createProvider(provider);
  }

  @Override
  public Provider getProviderById(Integer providerId) {
    return providersPort.getProviderById(providerId);
  }
}
