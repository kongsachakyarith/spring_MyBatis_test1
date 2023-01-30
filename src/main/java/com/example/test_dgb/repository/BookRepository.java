package com.example.test_dgb.repository;

import com.example.test_dgb.model.entities.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookRepository {

    @Select("SELECT id, id as book_id, title, import_date, author_id FROM books")

    List<Book> getAllBooks();

    Book findById(Integer bookId);
}
