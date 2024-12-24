package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.web.bind.annotation.*;
import com.example.demo.entities.User;
import com.example.demo.services.UserService;

import java.util.List;

@RestController

public class UserController {

    @Autowired
    public UserService userService;

    @PostMapping("/adduser")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @PutMapping("/updateuser")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/deleteuser/{id}")
    public String deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        return "User deleted successfully";
    }

    @GetMapping("/getusers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/getuser/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }
}