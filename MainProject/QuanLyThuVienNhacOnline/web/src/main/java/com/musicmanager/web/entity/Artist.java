package com.musicmanager.web.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "artists")
public class Artist
{
    // THUỘC TÍNH
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String country;
    private String gender;
    private String informations;

    // GETTER VÀ SETTER
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

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getInformations()
    {
        return informations;
    }

    public void setInformations(String informations)
    {
        this.informations = informations;
    }
}
