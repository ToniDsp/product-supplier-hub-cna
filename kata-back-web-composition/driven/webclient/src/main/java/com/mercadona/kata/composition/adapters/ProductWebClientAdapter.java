package com.mercadona.kata.composition.adapters;

import com.mercadona.kata.composition.application.ports.driven.ProductPort;
import com.mercadona.kata.composition.domain.Product;
import com.mercadona.kata.composition.mappers.ProductWebClientMapper;
import com.product.example.client.ApiClient;
import com.product.example.client.api.ProductsApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import com.product.example.client.model.ProductResponse;

@Service
public class ProductWebClientAdapter extends ProductsApi implements ProductPort {

  private final ProductWebClientMapper mapper;

  public ProductWebClientAdapter(WebClient webClient, @Value("localhost:8082") String baseUrl, ProductWebClientMapper mapper) {

    super.setApiClient(new ApiClient(webClient));
    super.getApiClient().setBasePath(baseUrl);
    this.mapper = mapper;
  }

  @Override
  public Product createProductInBd(Integer id, Product product) {
    ProductResponse product1 = super.createProduct(id, mapper.toRequest(product)).block();
    return mapper.toDomain(product1);
  }

  @Override
  public void deleteProductById(Integer id, Integer productId) {
    super.deleteProduct(id, productId).block();
  }

  @Override
  public Product getProductById(Integer id, Integer productId) {
    ProductResponse productResponse = super.getProduct(id, productId).block();
    return mapper.toDomain(productResponse);
  }
}
