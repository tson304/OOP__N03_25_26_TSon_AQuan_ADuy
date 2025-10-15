package com.musicmanager.web.controller;

import com.musicmanager.web.dto.request.UserCreateRequest;
import com.musicmanager.web.dto.request.UserUpdateRequest;
import com.musicmanager.web.model.User;
import com.musicmanager.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController
{
    @Autowired
    private UserService userService;

    @PostMapping
    User createUser(@RequestBody UserCreateRequest request)
    {
        return userService.createUser(request);
    }

    @GetMapping
    List<User> getUsers()
    {
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    User getUser(@PathVariable("id") String id)
    {
        return userService.getUser(id);
    }

    @PutMapping("/{id}")
    User updateUser(@PathVariable String id, @RequestBody UserUpdateRequest request)
    {
        return userService.updateUser(request, id);
    }

    @DeleteMapping("/{id}")
    String deleteUser(@PathVariable String id)
    {
        userService.deleteUser(id);
        return "User has been deleted";
    }
}
