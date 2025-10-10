package com.musicmanager.web.model;

import java.util.*;

public class User {
    // Thuộc tính:
    private Long id;
    private String name;
    private String password;
    private Set<Playlist> playlists = new HashSet<>();

    // Constructor mặc định:
    public User(){}

    public User(String id, String password) {
        this.name = name;
        this.password = password;
    }

    // GETTER và SETTER với mỗi thuộc tính:
    // User ID
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    // User Name
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    // User Password
    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    // User Playlists
    public Set<Playlist> getPlaylists(){
        return playlists;
    }

    public void setPlaylists(Set<Playlist> playlists){
        this.playlists = playlists;
    }
}