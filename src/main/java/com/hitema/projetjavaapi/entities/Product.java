package com.hitema.projetjavaapi.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {

    @Id
    private Long id;
    private String code;
    private String name;
    private String description;
    private List<byte[]> pictures;
    private Category category;
    private Double price;

    public Product id(Long id) {
        this.id = id;
        return this;
    }

    public Product code(String code) {
        this.code = code;
        return this;
    }

    public Product name(String name) {
        this.name = name;
        return this;
    }

    public Product description(String description) {
        this.description = description;
        return this;
    }

    public Product pictures(List<byte[]> pictures) {
        this.pictures = pictures;
        return this;
    }

    public Product category(Category category) {
        this.category = category;
        return this;
    }

    public Product price(Double price) {
        this.price = price;
        return this;
    }
}
