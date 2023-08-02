package codeacademy.API.controllers;

import codeacademy.API.entities.Author;
import codeacademy.API.services.AuthorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
@RestController
public class AuthorController {
    @Autowired
    private AuthorServices authorServices;


    @GetMapping("/author")
     public Author getAuthor(@RequestParam Long id) {
        Optional author = authorServices.getAuthor((id));
        if (author.isPresent()){
            return (Author) author.get();
        }
        return null;
    }
}
