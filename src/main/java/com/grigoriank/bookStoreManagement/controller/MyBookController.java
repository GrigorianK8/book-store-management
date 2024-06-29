package com.grigoriank.bookStoreManagement.controller;

import com.grigoriank.bookStoreManagement.entity.Book;
import com.grigoriank.bookStoreManagement.entity.MyBook;
import com.grigoriank.bookStoreManagement.service.BookService;
import com.grigoriank.bookStoreManagement.service.MyBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MyBookController {

    private final MyBookService myBookService;
    private final BookService bookService;

    @GetMapping("/my-books")
    public String getMyBooks(Model model) {
        List<MyBook> books = myBookService.getAllMyBooks();
        model.addAttribute("book", books);
        return "myBooks";
    }

    @RequestMapping("/mylist/{id}")
    public String getMyList(@PathVariable("id") int id) {
        Book b = bookService.getBookById(id);
        MyBook books = new MyBook(b.getId(),b.getName(),b.getAuthor(),b.getPrice());
        myBookService.saveMyBooks(books);
        return "redirect:/my-books";
    }

    @RequestMapping("/deleteMyList/{id}")
    public String deleteMyList(@PathVariable("id") int id) {
        myBookService.deleteById(id);
        return "redirect:/my-books";
    }
}
