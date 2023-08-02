package codeacademy.API.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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


    public Author(int id, String authorName, String nationality) {
        this.id = (long) id;
        this.authorName = authorName;
        this.nationality = nationality;
    }
}