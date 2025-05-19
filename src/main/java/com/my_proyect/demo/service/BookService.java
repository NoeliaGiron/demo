package com.my_proyect.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my_proyect.demo.model.Book;
import com.my_proyect.demo.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    // Obtener todos los libros
    public Iterable<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Crear un libro
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    // Buscar por título
    public Optional<Book> findBookByTitle(String title) {
        return bookRepository.findBookByTitle(title);
    }

    // Buscar por ID
    public Optional<Book> findBookById(String id) {
        return bookRepository.findById(id);
    }

    // Eliminar por título (manual)
    public boolean deleteBookByTitle(String title) {
        Optional<Book> bookToDelete = bookRepository.findBookByTitle(title);
        if (bookToDelete.isPresent()) {
            bookRepository.deleteById(bookToDelete.get().getId());
            return true;
        }
        return false;
    }

    // Actualizar libro
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    // Borrar libro directamente
    public void deleteBook(Book book) {
        bookRepository.delete(book);
    }
}
