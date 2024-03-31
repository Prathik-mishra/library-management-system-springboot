package com.acciojob.librarymanagementsystem.Repository;

import com.acciojob.librarymanagementsystem.Entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Author,Integer> {

}
