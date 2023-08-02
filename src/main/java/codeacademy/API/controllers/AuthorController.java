package codeacademy.API.controllers;

import codeacademy.API.entities.Author;
import codeacademy.API.services.AuthorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

public class AuthorController {

    private AuthorServices authorServices;

    @Autowired
    public AuthorController(AuthorServices authorServices) {
        this.authorServices = authorServices;
    }

    @GetMapping("/author")
     public Author getAuthor(@RequestParam Integer id) {
        Optional author = authorServices.getAuthor(id);
        if (author.isPresent()){
            return (Author) author.get();
        }
        return null;
    }
}
