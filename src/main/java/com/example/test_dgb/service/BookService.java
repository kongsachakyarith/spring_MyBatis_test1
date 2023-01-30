package com.example.test_dgb.service;

import com.example.test_dgb.model.entities.Book;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();

    Book findBookById(Integer bookId);
}
