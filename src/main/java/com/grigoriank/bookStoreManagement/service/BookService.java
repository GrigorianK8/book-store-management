package com.grigoriank.bookStoreManagement.service;

import com.grigoriank.bookStoreManagement.entity.Book;

import java.util.List;

public interface BookService {

    void save(Book book);

    List<Book> getAllBooks();

    Book getBookById(int id);

    void deleteBook(int id);
}
