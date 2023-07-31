package codeacademy.API.controllers;


import codeacademy.API.entities.Book;
import codeacademy.API.entities.Users;
import codeacademy.API.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class BookController {

    private BookServices bookservices;

    @Autowired
    public BookController(BookServices bookservices) {

        this.bookservices = bookservices;
    }

    @GetMapping("/book")
    public Book getBook(@RequestParam Integer id) {
        Optional book = bookservices.getBook(id);
        if (book.isPresent()){
            return (Book) book.get();
        }
        return null;
    }
}