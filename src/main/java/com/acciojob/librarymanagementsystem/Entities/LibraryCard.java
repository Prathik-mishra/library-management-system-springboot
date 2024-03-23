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
    private Integer cardId;

    @Enumerated(value = EnumType.STRING)
    private cardStatus status;

    private Integer noOfBooksIssued;
}
