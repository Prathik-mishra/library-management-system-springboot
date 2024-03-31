package com.acciojob.librarymanagementsystem.Entities;

import com.acciojob.librarymanagementsystem.Enums.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;

    @Column(unique = true)
    private String bookName;

    @Enumerated(value = EnumType.STRING)
    private Genre  bookGenre;

    private int noOfPages;

    private int price;

    private Date publishingDate;

    @JoinColumn
    @ManyToOne
    private Author author;
}
