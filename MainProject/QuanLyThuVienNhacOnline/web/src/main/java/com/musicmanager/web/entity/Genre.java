package com.musicmanager.web.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "genres")
public class Genre
{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;

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
}
