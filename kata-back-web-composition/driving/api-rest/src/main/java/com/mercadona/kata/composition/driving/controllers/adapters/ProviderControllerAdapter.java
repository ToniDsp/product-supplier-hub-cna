package com.mercadona.kata.composition.driving.controllers.adapters;

import com.example.api.ProvidersApi;
import com.example.model.ProviderRequest;
import com.example.model.ProviderResponse;
import com.mercadona.kata.composition.application.services.ProvidersService;
import com.mercadona.kata.composition.driving.controllers.mappers.ProductControllerMapper;
import com.mercadona.kata.composition.driving.controllers.mappers.ProviderControllerMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@AllArgsConstructor
@Controller
public class ProviderControllerAdapter implements ProvidersApi {

  private final ProvidersService providerService;
  private final ProviderControllerMapper mapper;

  @Override
  public ResponseEntity<ProviderResponse> createProvider(ProviderRequest request) {
    return new ResponseEntity<>(mapper.toResponse(providerService.createProvider(mapper.toDomain(request))), HttpStatus.OK);
  }
}
