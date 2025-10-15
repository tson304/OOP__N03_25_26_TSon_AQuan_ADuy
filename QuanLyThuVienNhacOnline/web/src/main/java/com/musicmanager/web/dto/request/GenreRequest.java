package com.musicmanager.web.dto.request;

import com.musicmanager.web.model.Song;
import jakarta.persistence.*;
import java.util.*;

public class GenreRequest {
    private String id;
    private String name;
    @OneToMany
    private Set<Song> songs = new HashSet<>();

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Set<Song> getSongs(){
        return songs;
    }

    public void setSongs(Set<Song> songs){
        this.songs = songs;
    }
}
