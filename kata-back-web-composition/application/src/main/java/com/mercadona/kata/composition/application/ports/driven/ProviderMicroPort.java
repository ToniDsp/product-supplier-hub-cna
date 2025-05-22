package com.mercadona.kata.composition.application.ports.driven;

import com.mercadona.kata.composition.domain.Provider;
import org.springframework.stereotype.Service;


public interface ProviderMicroPort {
  Provider createProvider(Provider provider);

  Provider getProviderById(Integer providerId);

}
