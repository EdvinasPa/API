package codeacademy.API.services;


import codeacademy.API.entities.Author;
import codeacademy.API.entities.Users;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class AuthorServices {
    private static List<Author> authorList;

    public AuthorServices() {
        authorList = new ArrayList<>();

        Author author1 = new Author(1, "Arturas", "Britas");
        Author author2 = new Author(2, "Petras", "Rusas");
        Author author3 = new Author(3, "Tomas", "Vokietis");
        Author author4 = new Author(4, "Arturas", "Amerikietis");

        authorList.addAll(Arrays.asList(author1, author2, author3, author4));
    }
    public Optional<Author> getAuthor(Integer id) {
        Optional<Author> optional = Optional.empty();
        for (Author author : authorList) {
            if (id.equals(author.getId())) {
                optional = Optional.of(author);
                return optional;
            }
        }
        return optional;
    }
}

