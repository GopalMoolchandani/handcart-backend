package com.handcart.productService.service;

import com.handcart.productService.dto.ProductRequest;
import com.handcart.productService.dto.ProductResponse;
import com.handcart.productService.model.Product;
import com.handcart.productService.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public void createProduct(ProductRequest productRequest) {
        // Logic to create a product and return its ID
        Product product = new Product();
        product.setDescription(productRequest.getDescription());
        product.setName(productRequest.getName());
        product.setPrice(productRequest.getPrice());

        productRepository.save(product);
        log.info("Created product with ID: {}", product.getId());
    }
    public List<ProductResponse> findAllProducts(){
        List<Product> productList = this.productRepository.findAll();
        return productList.stream().map( product ->
                ProductResponse.builder().name(product.getName())
                       .description(product.getDescription())
                   .price(product.getPrice())
                        .id(product.getId())
                    .build()
                ).collect(Collectors.toList());
    }
}
