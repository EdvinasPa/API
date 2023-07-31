package codeacademy.API.entities;


import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
public class Book {

    private Long id;
    private String title;
    private String genre;
    private BigDecimal price;
    private Integer quantity;

    public Book(int id, String title, String genre, Double price, Integer quantity) {
        this.id = (long) id;
        this.title = title;
        this.genre = genre;
        this.price = BigDecimal.valueOf(price);
        this.quantity = quantity;
    }




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}

