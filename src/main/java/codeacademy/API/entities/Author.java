package codeacademy.API.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@Setter
@Table(name = "Author")
public class Author {
    @Id
    @Column(name = "id_author")
    private Long id;
    @Column(name = "authorName")
    private String authorName;
    @Column(name = "nationality")
    private String nationality;
    @OneToMany (mappedBy = "author")
    private List<Book> book;


    public Author(int id, String authorName, String nationality) {
        this.id = (long) id;
        this.authorName = authorName;
        this.nationality = nationality;
    }
    
}