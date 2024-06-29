package com.grigoriank.bookStoreManagement.service.impl;

import com.grigoriank.bookStoreManagement.entity.MyBook;
import com.grigoriank.bookStoreManagement.repository.MyBookRepository;
import com.grigoriank.bookStoreManagement.service.MyBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MyBookServiceImpl implements MyBookService {

    private final MyBookRepository myBookRepository;

    @Override
    public void saveMyBooks(MyBook books) {
        myBookRepository.save(books);
    }

    @Override
    public List<MyBook> getAllMyBooks() {
        return myBookRepository.findAll();
    }

    @Override
    public void deleteById(int id) {
        myBookRepository.deleteById(id);
    }
}
