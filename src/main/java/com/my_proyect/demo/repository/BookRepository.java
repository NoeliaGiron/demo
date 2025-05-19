package com.my_proyect.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my_proyect.demo.model.Book;

public interface  BookRepository extends JpaRepository<Book, Long>{

    //agregar mas operaciones personalizadas
	Optional<Book> findBookByTitle(String title);
	Optional<Book> deleteBookByTitle(String title);

    
}
