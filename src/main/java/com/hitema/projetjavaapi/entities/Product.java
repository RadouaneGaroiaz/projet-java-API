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
    private String id;
    private String code;
    private String name;
    private String description;
    private List<byte[]> pictures;
    private Category category;
    private Double price;
}
