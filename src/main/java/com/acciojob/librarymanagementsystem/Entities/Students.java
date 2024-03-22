package com.acciojob.librarymanagementsystem.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Students {

    @Id
    private Integer studentRollNo;

    private String name;

    private String branch;

    private double cgpa;

    private String phoneNo;
}
