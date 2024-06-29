package com.grigoriank.bookStoreManagement.repository;

import com.grigoriank.bookStoreManagement.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
