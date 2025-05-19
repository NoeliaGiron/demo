package com.my_proyect.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my_proyect.demo.model.Book;
import com.my_proyect.demo.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

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

    // Eliminar por título
    public boolean deleteBookByTitle(String title) {
        Optional<Book> bookToDelete = bookRepository.findBookByTitle(title);
        if (bookToDelete.isPresent()) {
            bookRepository.deleteById(bookToDelete.get().getId());
            return true;
        }
        return false;
    }

    // Actualizar libro (requiere que el libro ya exista)
    public Optional<Book> updateBook(String id, Book updatedBook) {
        return bookRepository.findById(id).map(existingBook -> {
            existingBook.setTitle(updatedBook.getTitle());
            existingBook.setAuthor(updatedBook.getAuthor());
            existingBook.setPublishedYear(updatedBook.getPublishedYear());
            existingBook.setIsbn(updatedBook.getIsbn());
            existingBook.setPage(updatedBook.getPage());
            return bookRepository.save(existingBook);
        });
    }

    // Eliminar libro directamente
    public void deleteBook(Book book) {
        bookRepository.delete(book);
    }
}
