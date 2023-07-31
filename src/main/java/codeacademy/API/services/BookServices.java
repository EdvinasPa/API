package codeacademy.API.services;

import codeacademy.API.entities.Book;
import codeacademy.API.entities.Users;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class BookServices {

    private static List<Book> bookList;

    public BookServices() {
        bookList = new ArrayList<>();

        Book book1 = new Book(1, "Pasaka", "Pasaka", 19.99, 20);
        Book book2 = new Book(2, "Drama", "Drama", 19.99, 20);
        Book book3 = new Book(3, "Detektyvas", "Detektyvas", 19.99, 20);
        Book book4 = new Book(4, "Pasaka", "Pasaka", 10.99, 20);

        bookList.addAll(Arrays.asList(book1, book2, book3, book4));
    }

    public Optional<Book> getBook(Integer id) {
        Optional<Book> optional = Optional.empty();
        for (Book book : bookList) {
            if (id.equals(book.getId())) {
                optional = Optional.of(book);
                return optional;
            }
        }
        return optional;
    }
}
