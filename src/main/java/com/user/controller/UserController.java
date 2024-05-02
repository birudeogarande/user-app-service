package com.user.controller;

import com.user.model.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all/users/{pageSize}/{pageNumber}")
    public List<User> getUsers(@PathVariable Integer pageSize, @PathVariable Integer pageNumber){
        return userService.getAllUsers(pageSize, pageNumber);
    }
    @PostMapping("/save/users")
    public List<User> saveUserList(@RequestBody List<User> users){
        return userService.saveUsers(users);
    }
}
