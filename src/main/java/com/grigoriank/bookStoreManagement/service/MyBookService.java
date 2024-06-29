package com.grigoriank.bookStoreManagement.service;

import com.grigoriank.bookStoreManagement.entity.MyBook;

import java.util.List;

public interface MyBookService {

    void saveMyBooks(MyBook books);

    List<MyBook> getAllMyBooks();

    void deleteById(int id);
}
