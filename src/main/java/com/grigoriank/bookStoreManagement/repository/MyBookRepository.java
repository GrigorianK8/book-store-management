package com.grigoriank.bookStoreManagement.repository;

import com.grigoriank.bookStoreManagement.entity.MyBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyBookRepository extends JpaRepository<MyBook, Integer> {
}
