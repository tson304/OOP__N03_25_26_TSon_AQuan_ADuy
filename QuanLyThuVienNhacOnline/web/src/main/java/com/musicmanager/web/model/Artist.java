package com.musicmanager.web.model;

import java.util.*;

public class Artist{
    // Thuộc tính:
    private Long id;
    private String name;
    private String country;
    private Set<Song> songs = new HashSet<>();

    // Constructor mặc định:
    public Artist(){}

    // GETTER và SETTER của các thuộc tính:
    // Artist ID
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    // Artist Name
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Artist Country
    public String getCountry() {
        return country;
    }

    public void setCountry(String country){
        this.country = country;
    }

    // Artist Songs
    public Set<Song> getSongs(){
        return songs;
    }

    public void setSongs(Set<Song> songs){
        this.songs = songs;
    }
}
