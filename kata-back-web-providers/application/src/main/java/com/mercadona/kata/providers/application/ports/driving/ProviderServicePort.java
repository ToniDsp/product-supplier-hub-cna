package com.mercadona.kata.providers.application.ports.driving;

import com.mercadona.kata.providers.domain.Provider;
import org.springframework.stereotype.Service;

@Service
public interface ProviderServicePort {
  Provider create(Provider provider);
  Provider getProviderById(Integer id);
}
