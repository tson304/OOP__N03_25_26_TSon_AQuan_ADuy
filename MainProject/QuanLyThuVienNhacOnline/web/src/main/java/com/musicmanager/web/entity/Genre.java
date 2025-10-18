package com.musicmanager.web.entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "genres")
public class Genre
{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)

    private String id;
    private String name;
    @OneToMany
    private Set<Song> songs = new HashSet<>();

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Set<Song> getSongs()
    {
        return songs;
    }

    public void setSongs(Set<Song> songs)
    {
        this.songs = songs;
    }
}
