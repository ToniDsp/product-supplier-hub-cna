package com.mercadona.kata.providers.driving.controllers.adapters;

import com.example.api.ProvidersApi;
import com.example.model.ProviderRequest;
import com.example.model.ProviderResponse;
import com.mercadona.kata.providers.application.ports.driving.ProviderServicePort;
import com.mercadona.kata.providers.driving.controllers.mappers.ProvidersControllerMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class ProvidersControllerAdapter implements ProvidersApi {

  private final ProviderServicePort servicePort;
  private final ProvidersControllerMapper mapper;

  @Override
  public ResponseEntity<ProviderResponse> createProvider(ProviderRequest providerRequest) {
    return new ResponseEntity<>(mapper.toResponse(servicePort.create(mapper.toDomain(providerRequest))), HttpStatus.CREATED);
  }

  @Override
  public ResponseEntity<ProviderResponse> getProviderById(Integer id) {
    return new ResponseEntity<>(mapper.toResponse(servicePort.getProviderById(id)), HttpStatus.OK);
  }
}
