package com.my_proyect.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RedisHash("Book")  // Redis usará esto como prefijo
public class Book implements Serializable {

    @Id
    private String id;

    private String title;
    private String author;
    private Integer publishedYear;
    private String isbn;
    private String page;
}
