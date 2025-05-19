package com.my_proyect.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Table(name="book")

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="BOOK_ID")
    private long bookId;

    @Column(name="BOOK_TITLE")
    private String title;

    @Column(name="BOOK_AUTHOR")
    private String author;

    @Column(name="BOOK_PUBLISHED_YEAR")
    private Integer publishedYear;

    @Column(name="BOOK_ISBN")
    private String isbn;

    @Column(name="BOOK_PAGE")
    private String page;

}
