package com.handcart.productService.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE) // To make the fields private and provide getters/setters
@Getter
@Setter
@ToString
@Builder
public class ProductResponse {
    private String id;

    private String name;
    private String description;
    private BigDecimal price;

}
