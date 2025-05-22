package com.mercadona.kata.providers.application.ports.driven;

import com.mercadona.kata.providers.domain.Provider;

public interface ProviderRepositoryPort {
  Provider create(Provider provider);
  Provider getProviderById(Integer id);
}
