package com.musicmanager.web.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Artist{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    // Thuộc tính:
    private String id;
    private String name;
    private String country;
    @OneToMany()
    private Set<Song> songs = new HashSet<>();

    public Artist() {
    }

    public Artist(String name) {
        this.name = name;
    }

    // GETTER và SETTER của các thuộc tính:
    // Artist ID
    public String getId(){
        return id;
    }

    public void setId(String id){
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
