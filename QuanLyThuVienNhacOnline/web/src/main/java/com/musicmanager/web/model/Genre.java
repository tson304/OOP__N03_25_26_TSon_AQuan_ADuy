package com.musicmanager.web.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "genres")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // Thuộc tính
    @Column(name = "genre_id")
    private Long id;

    @Column(name = "genre_name")
    private String name;

    @OneToMany(mappedBy = "genre", cascade = CascadeType.ALL, orphanRemoval = true)
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
