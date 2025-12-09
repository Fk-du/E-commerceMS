package com.example.Product.Service;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductRequest {
    private String name;
    private String description;
    private Double price;
    private Integer stock;
}

