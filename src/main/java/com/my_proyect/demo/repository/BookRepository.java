package com.my_proyect.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.my_proyect.demo.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, String> {

    Optional<Book> findBookByTitle(String title);
    Optional<Book> deleteBookByTitle(String title);
}
