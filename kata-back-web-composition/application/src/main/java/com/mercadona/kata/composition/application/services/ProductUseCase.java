package com.mercadona.kata.composition.application.services;

import com.mercadona.kata.composition.application.exceptions.ExampleNotFoundException;
import com.mercadona.kata.composition.application.ports.driving.ProductsServicePort;
import com.mercadona.kata.composition.application.ports.driving.ProvidersServicePort;
import com.mercadona.kata.composition.domain.Product;
import com.mercadona.kata.composition.domain.Provider;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductUseCase implements ProductsServicePort {

  private ProductsService productsService;
  private ProvidersServicePort providersService;

  @Override
  public Product createProduct(Integer id, Product product) {
    Provider provider = providersService.getProviderById(id);
    if(provider != null) {
      return productsService.createProduct(id, product);
    }else {
      throw new ExampleNotFoundException("No Provider four for id: " + id, "404" );
    }
  }

  @Override
  public void deleteProduct(Integer providerId, Integer productId) {
    Provider provider = providersService.getProviderById(providerId);
    if(provider != null) {
      productsService.deleteProduct(providerId, productId);
    }else {
      throw new ExampleNotFoundException("No Provider four for id: " + providerId, "404" );
    }
  }

  @Override
  public Product getProductById(Integer id, Integer productId) {
    Provider provider = providersService.getProviderById(id);
    if(provider != null) {
      Product result = productsService.getProductById(id, productId);
      if (result != null) {
        return result;
      }else{
        throw new ExampleNotFoundException("No Product four for id: " + productId, "404" );
      }
    }else{
      throw new ExampleNotFoundException("No Provider four for id: " + id, "404" );
    }
  }
}
