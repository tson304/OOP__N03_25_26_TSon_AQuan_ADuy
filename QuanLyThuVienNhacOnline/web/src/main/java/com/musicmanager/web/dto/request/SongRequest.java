package com.musicmanager.web.dto.request;

import com.musicmanager.web.model.Artist;
import com.musicmanager.web.model.Genre;
import jakarta.persistence.*;
import java.sql.Time;

public class SongRequest {
    private String name;
    private Integer releaseYear;
    private String audioFilePath;
    private Time duration;
    @ManyToOne
    private Artist artist;
    @ManyToOne
    private Genre genre;

    // Song Name
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    // Song Release Year
    public Integer getReleaseYear(){
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear){
        this.releaseYear = releaseYear;
    }

    // Song Audio File Path
    public String getAudioFilePath(){
        return audioFilePath;
    }

    public void setAudioFilePath(String audioFilePath){
        this.audioFilePath = audioFilePath;
    }

    // Song Duration
    public Time getDuration(){
        return duration;
    }

    public void setDuration(Time duration){
        this.duration = duration;
    }

    // Song of Artist
    public Artist getArtist(){
        return artist;
    }

    public void setArtist(Artist artist){
        this.artist = artist;
    }

    // Song Genre
    public Genre getGenre(){
        return genre;
    }

    public void setGenre(Genre genre){
        this.genre = genre;
    }
}