package com.api.libros.service;

import com.api.libros.model.Book;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BookService {

    public List<Book> getAllBooks() {
        return Arrays.asList(
                new Book(1L, "Libro 1", "Autor1", "Ficcion", 2020, "Llibro de ficcion"),
                new Book(2L, "Libro 2", "Autor2", "Ficcion", 2020, "Llibro de ficcion")
        );
    }
}
