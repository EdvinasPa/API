package codeacademy.API.entities;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Users")


public class Users {
    @Id
    @Column(name = "id_users")
    private int id;
    @Column(name = "Name")
    private String name;
    @Column(name = "age")
    private int age;
    @Column(name = "email")
    private String email;
    @OneToMany
    List<UsersBook> userBook;



    public Users(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
