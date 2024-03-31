package com.acciojob.librarymanagementsystem.Repository;

import com.acciojob.librarymanagementsystem.Entities.LibraryCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<LibraryCard, Integer> {

}
