package com.musicmanager.web.models;

import jakarta.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "songs")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // Thuộc tính:
    @Column(name = "song_id")
    private Long id;

    @Column(name = "song_name")
    private String name;

    @Column(name = "song_year_release")
    private Integer releaseYear;

    @Column(name = "song_audio_file_path")
    private String audioFilePath;

    @Column(name = "song_duration")
    private Time duration;

    @ManyToOne
    @JoinColumn(name = "artist_id", nullable = false)
    private Artist artist;

    @ManyToOne
    @JoinColumn(name = "genre_id", nullable = false)
    private Genre genre;

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
}