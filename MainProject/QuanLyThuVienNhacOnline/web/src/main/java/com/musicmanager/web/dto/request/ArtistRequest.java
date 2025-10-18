package com.musicmanager.web.dto.request;

public class ArtistRequest
{
    private String name;
    private String country;
    private String gender;
    private String informations;

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
