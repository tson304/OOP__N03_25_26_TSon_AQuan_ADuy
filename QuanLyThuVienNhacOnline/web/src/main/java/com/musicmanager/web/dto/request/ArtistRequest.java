package com.musicmanager.web.dto.request;

public class ArtistRequest{
    private String name;
    private String country;

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

}
