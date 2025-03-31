package com.handcart.productService.controller;

import com.handcart.productService.dto.ProductRequest;
import com.handcart.productService.dto.ProductResponse;
import com.handcart.productService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest) {
        // Logic to create a product and return its ID
        this.productService.createProduct(productRequest);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts(){
        return this.productService.findAllProducts();
    }
}
