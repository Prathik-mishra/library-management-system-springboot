package com.acciojob.librarymanagementsystem.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "author")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer authorId;

    private String authorName;

    private int authorAge;

    @Column(unique = true)
    private String emailId;

    private int age;
}
