package com.grigoriank.bookStoreManagement.controller;

import com.grigoriank.bookStoreManagement.entity.Book;
import com.grigoriank.bookStoreManagement.entity.MyBook;
import com.grigoriank.bookStoreManagement.service.BookService;
import com.grigoriank.bookStoreManagement.service.MyBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;
    private final MyBookService myBookService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/book-register")
    public String bookRegister() {
        return "bookRegister";
    }

    @GetMapping("/available-books")
    public ModelAndView getAllBook() {
        List<Book> list = bookService.getAllBooks();
        return new ModelAndView("bookList", "book", list);
    }

    @PostMapping("/save")
    public String addBook(@ModelAttribute Book book) {
        bookService.save(book);
        return "redirect:/available-books";
    }

    @RequestMapping("/editBook/{id}")
    public String editBook(@PathVariable("id") int id, Model model) {
        Book b = bookService.getBookById(id);
        model.addAttribute("book", b);
        return "bookEdit";
    }

    @RequestMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable("id") int id) {
        bookService.deleteBook(id);
        return "redirect:/available-books";
    }
}
