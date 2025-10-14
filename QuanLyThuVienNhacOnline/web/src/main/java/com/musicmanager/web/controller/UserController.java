package com.musicmanager.web.controller;

import com.musicmanager.web.dto.request.UserCreateRequest;
import com.musicmanager.web.model.User;
import com.musicmanager.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    User createUser(@RequestBody UserCreateRequest request) {
        return userService.createUser(request);
    }

    @GetMapping
    List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/{usersId}")
    User getUser(@PathVariable("usersId") Long userId) {
        return userService.getUser(userId);
    }
}
