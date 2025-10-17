package com.musicmanager.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController
{
    @GetMapping("/")
    public String homePage()
    {
        return "home";
    }

    @GetMapping("/users")
    public String userPage()
    {
        return "users";
    }

    @GetMapping("/artists")
    public String artistPage()
    {
        return "artists";
    }

    @GetMapping("/songs")
    public String songPage()
    {
        return "songs";
    }

    @GetMapping("/genres")
    public String genrePage()
    {
        return "genres";
    }
}