package com.my_proyect.demo.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.my_proyect.demo.model.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {

    Optional<Book> findBookByTitle(String title);
    void deleteByTitle(String title);
}
