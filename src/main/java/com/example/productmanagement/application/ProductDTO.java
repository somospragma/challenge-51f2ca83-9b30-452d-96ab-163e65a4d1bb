package com.example.productmanagement.application;

import com.example.productmanagement.domain.Product;
import java.math.BigDecimal;

public record ProductDTO(String id, String name, BigDecimal price, int stock, String category) {
    public ProductDTO(Product product) {
        this(product.getId(), product.getName(), product.getPrice(), product.getStock(), product.getCategory());
    }
}