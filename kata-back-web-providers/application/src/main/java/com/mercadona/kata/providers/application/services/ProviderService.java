package com.mercadona.kata.providers.application.services;

import com.mercadona.kata.providers.application.ports.driving.ProviderServicePort;
import com.mercadona.kata.providers.domain.Provider;

public class ProviderService implements ProviderServicePort {

  private final ProviderServicePort repositoryService;

  @Override
  public Provider create(Provider provider) {
    return repositoryService.create(provider);
  }

  @Override
  public Provider getProviderById(Integer id) {
    return repositoryService.getProviderById(id);
  }
}
