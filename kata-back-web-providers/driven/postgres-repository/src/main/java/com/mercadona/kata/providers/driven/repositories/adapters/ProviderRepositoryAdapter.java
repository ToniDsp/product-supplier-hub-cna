package com.mercadona.kata.providers.driven.repositories.adapters;

import com.mercadona.kata.providers.application.ports.driven.ProviderRepositoryPort;
import com.mercadona.kata.providers.domain.Provider;
import com.mercadona.kata.providers.driven.repositories.ProviderMOJpaRepository;
import com.mercadona.kata.providers.driven.repositories.mappers.ProviderRepositoryMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProviderRepositoryAdapter implements ProviderRepositoryPort {

  private final ProviderMOJpaRepository repository;
  private final ProviderRepositoryMapper mapper;


  @Override
  public Provider create(Provider provider) {
    return mapper.toDomain(repository.save(mapper.toMO(provider)));
  }

  @Override
  public Provider getProviderById(Integer id) {
    return mapper.toDomain(repository.findProviderMOById(id));
  }
}
