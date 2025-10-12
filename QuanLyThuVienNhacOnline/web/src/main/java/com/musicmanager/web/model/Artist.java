package com.musicmanager.web.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "artists")
public class Artist{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Thuộc tính:
    @Column(name = "artist_id")
    private Long id;

    @Column(name = "artist_name")
    private String name;

    @Column(name = "artist_country")
    private String country;

    @OneToMany(mappedBy = "artist", cascade = CascadeType.ALL, orphanRemoval = true)
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
