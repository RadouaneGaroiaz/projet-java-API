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
}
