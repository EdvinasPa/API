package codeacademy.API.services;

import codeacademy.API.entities.Users;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServices {

    private List<Users> userList;

    public UserServices() {
        userList = new ArrayList<>();

        Users user1 = new Users(1, "Lina", 20, "hotgirl@gmail.com");
        Users user2 = new Users(2, "Petras", 20, "karsis@gmail.com");
        Users user3 = new Users(3, "Tadas", 20, "blinda@gmail.com");
        Users user4 = new Users(4, "Kritina", 20, "kriste@gmail.com");
        Users user5 = new Users(5, "Kestutis", 20, "kiesa@gmail.com");

        userList.addAll(Arrays.asList(user1, user2, user3, user4, user5));
    }

    public Optional<Users> getUser(Integer id) {
        Optional<Users> optional = Optional.empty();
        for (Users user : userList) {
            if (id.equals(user.getId())) {
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
