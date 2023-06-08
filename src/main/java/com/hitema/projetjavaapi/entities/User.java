package com.hitema.projetjavaapi.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Entity
@Document(collection = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Long id;

    private String email;

    private String password;

    @Column(name = "first_name", nullable = false)
    private String firstname;

    @Column(name = "last_name", nullable = false)
    private String lastname;

    @Column(name = "creation_date", nullable = false)
    private LocalDateTime creationDate;

    private Boolean active;

    @ToString.Exclude
    private byte[] picture;


    public User id(Long id) {
        this.id = id;
        return this;
    }

    public User email(String email) {
        this.email = email;
        return this;
    }

    public User password(String password) {
        this.password = password;
        return this;
    }

    public User firstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public User lastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public User creationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    public User active(Boolean active) {
        this.active = active;
        return this;
    }

    public User picture(byte[] picture) {
        this.picture = picture;
        return this;
    }
}
