package com.mercadona.kata.providers.driven.repositories;

import com.mercadona.kata.providers.driven.repositories.models.ProviderMO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface ProviderMOJpaRepository extends JpaRepository<ProviderMO, Integer> {
  public ProviderMO findProviderMOById(Integer id);

}
