package codeacademy.API.entities;

import jakarta.persistence.Entity;;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Author {
    @Id
    private Long id;
    private String authorName;
    private String nationality;


    public Author(int id, String authorName, String nationality) {
        this.id = (long) id;
        this.authorName = authorName;
        this.nationality = nationality;
    }
}