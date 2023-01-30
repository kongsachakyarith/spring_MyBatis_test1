package com.example.test_dgb.service.serviceImp;

import com.example.test_dgb.model.entities.Book;
import com.example.test_dgb.repository.BookRepository;
import com.example.test_dgb.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImp implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImp(BookRepository bookRepository){
        this.bookRepository =bookRepository;
    }
    @Override
    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    @Override
    public Book findBookById(Integer bookId) {
        return bookRepository.findById(bookId);
    }
}
