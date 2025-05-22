package com.mercadona.kata.composition.application.ports.driving;

import com.mercadona.kata.composition.domain.Provider;

public interface ProvidersServicePort {

  Provider createProvider(Provider provider);

  Provider getProviderById(Integer providerId);
}
