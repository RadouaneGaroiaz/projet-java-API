package com.hitema.projetjavaapi.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "categories")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Category {

    @Id
    private Long id;
    private String name;
    private String description;

    public Category id(Long id) {
        this.id = id;
        return this;
    }

    public Category name(String name) {
        this.name = name;
        return this;
    }

    public Category description(String description) {
        this.description = description;
        return this;
    }
}
