package com.musicmanager.web.model;

import java.util.*;

public class Genre {
    // Thuộc tính
    private Long id;
    private String name;
    private Set<Song> songs = new HashSet<>();

    // Construtor mặc định:
    public Genre() {}

    //GETTER và SETTER với mỗi thuộc tính:
    // Genre ID
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    // Genre Name
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    // Genre Songs
    public Set<Song> getSongs(){
        return songs;
    }

    public void setSongs(Set<Song> songs){
        this.songs = songs;
    }
}
