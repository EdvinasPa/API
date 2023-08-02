package codeacademy.API.controllers;

import codeacademy.API.entities.Users;
import codeacademy.API.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    private UserServices userServices;

    @Autowired
    public UserController(UserServices userServices) {

        this.userServices = userServices;
    }

    @GetMapping("/user")
    public Users getUser(@RequestParam Integer id) {
        Optional user = userServices.getUser(id);
        if (user.isPresent()){
            return (Users) user.get();
        }
        return null;

    }
}
