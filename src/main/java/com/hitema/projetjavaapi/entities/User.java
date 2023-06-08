package com.hitema.projetjavaapi.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    @Id
    private String id;
    private String email;
    private String password;
    private String firstname;
    private String lastname;
    private LocalDateTime creationDate;
    private Boolean active;

    @ToString.Exclude
    private byte[] picture;
}
