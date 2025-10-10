package com.musicmanager.web.model;

import java.util.*;

public class Playlist {
    // Thuộc tính:
    private Long id;
    private String name;
    private User user;
    private Set<Song> songs = new HashSet<>();

    // Construtor mặc định:
    public Playlist(){}

    // GETTER và SETTER với mỗi thuộc tính:
    // Playlist ID
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    // Playlist Name
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    // Playlist User
    public User getUser(){
        return user;
    }

    public void setUser(User user){
        this.user = user;
    }

    // Playlist Songs
    public Set<Song> getSongs(){
        return songs;
    }

    public void setSongs(Set<Song> songs){
        this.songs = songs;
    }
}
