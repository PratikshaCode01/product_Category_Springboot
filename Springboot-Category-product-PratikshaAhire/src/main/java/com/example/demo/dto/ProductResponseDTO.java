
package com.example.demo.dto;

import com.example.demo.entity.Product;

public class ProductResponseDTO {
    private Long id;
    private String name;
    private double price;
    private String categoryName;

    public ProductResponseDTO(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
        this.categoryName = product.getCategory().getName();
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getCategoryName() { return categoryName; }
}
