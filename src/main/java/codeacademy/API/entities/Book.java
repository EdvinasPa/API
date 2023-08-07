package codeacademy.API.entities;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Book")
public class Book {
    @Id
    @Column(name = "id_book")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "genre")
    private String genre;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "quantity")
    private Integer quantity;
    @ManyToOne
    private Author author;


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



}


