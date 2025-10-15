package com.musicmanager.web.model;

import jakarta.persistence.*;
import java.sql.Time;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    // Thuộc tính:
    private String id;
    private String name;
    @ManyToOne()
    private Artist artist;

    @ManyToOne()
    private Genre genre;
    private int releaseYear;
    private String audioFilePath;
    private Time duration;

    public Song() {
    }

    public Song(Artist artist, Genre genre) {
        this.artist = artist;
        this.genre = genre;
    }

    // GETTER và SETTER với mỗi thuộc tính:
    // Song ID
    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

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