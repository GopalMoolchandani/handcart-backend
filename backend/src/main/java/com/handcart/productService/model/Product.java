package com.handcart.productService.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(collection = "Products")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data // For Jackson serialization/deserialization
public class Product {

    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
