package com.musicmanager.web.model;

import java.sql.Time;
import java.util.*;

public class Song {
    // Thuộc tính:
    private Long id;
    private String name;
    private Integer releaseYear;
    private String audioFilePath;
    private Time duration;
    private Artist artist;
    private Genre genre;
    private Set<Playlist> playlists = new HashSet<>();

    // Construtor mặc định:
    public Song(){}

    // GETTER và SETTER với mỗi thuộc tính:
    // Song ID
    public Long getId(){
        return id;
    }

    public void setId(Long id){
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

    // Song Playlist
    public Set<Playlist> getPlaylists(){
        return playlists;
    }

    public void setPlaylists(Set<Playlist> playlists){
        this.playlists = playlists;
    }
}