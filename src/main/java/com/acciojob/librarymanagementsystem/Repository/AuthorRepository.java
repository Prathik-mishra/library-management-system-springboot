package com.acciojob.librarymanagementsystem.Repository;

import com.acciojob.librarymanagementsystem.Entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Book,Integer> {

}
