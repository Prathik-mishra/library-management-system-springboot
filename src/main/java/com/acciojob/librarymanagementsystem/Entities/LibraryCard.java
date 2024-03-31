package com.acciojob.librarymanagementsystem.Entities;

import com.acciojob.librarymanagementsystem.Enums.cardStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "library card")
public class LibraryCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cardId;

    @Enumerated(value = EnumType.STRING)
    private cardStatus cardStatus;

    private Integer noOfBooksIssued;

    //Library card should have the foreign key column
    //bcz this is child class
    @JoinColumn
    @OneToOne
    private Students student;
}
