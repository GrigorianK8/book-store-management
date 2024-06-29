package com.grigoriank.bookStoreManagement.service.impl;

import com.grigoriank.bookStoreManagement.entity.Book;
import com.grigoriank.bookStoreManagement.repository.BookRepository;
import com.grigoriank.bookStoreManagement.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;


    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(int id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }
}
