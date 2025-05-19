package com.my_proyect.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "book")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Book {

    @Id
    private String id;

    private String title;
    private String author;
    private Integer publishedYear;
    private String isbn;
    private String page;
}