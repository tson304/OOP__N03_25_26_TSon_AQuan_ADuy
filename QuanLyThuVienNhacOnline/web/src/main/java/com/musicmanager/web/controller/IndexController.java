package com.musicmanager.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String inde() {
        return "index";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/user")
    public String user() {
        return "user";
    }

    @GetMapping("/song")
    public String song() {
        return "song";
    }

    @GetMapping("/artist")
    public String artist() {
        return "artist";
    }
}
