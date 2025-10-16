package com.musicmanager.web.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Artist
{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)

    private String id;
    private String name;
    private String country;
    @OneToMany(cascade = CascadeType.ALL)
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

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
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
