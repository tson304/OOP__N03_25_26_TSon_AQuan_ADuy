package com.musicmanager.web.entity;

import jakarta.persistence.*;
import java.sql.Time;

@Entity
public class Song
{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)

    private String id;
    private String title;
    @ManyToOne()
    private Artist artist;
    @ManyToOne()
    private Genre genre;
    private Integer releaseYear;
    private String audioFilePath;
    private Time duration;

    public Song() {}

    public Song(Artist artist, Genre genre)
    {
        this.artist = artist;
        this.genre = genre;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public Artist getArtist()
    {
        return artist;
    }

    public void setArtist(Artist artist)
    {
        this.artist = artist;
    }

    public Genre getGenre()
    {
        return genre;
    }

    public void setGenre(Genre genre)
    {
        this.genre = genre;
    }

    public Integer getReleaseYear()
    {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear)
    {
        this.releaseYear = releaseYear;
    }

    public String getAudioFilePath()
    {
        return audioFilePath;
    }

    public void setAudioFilePath(String audioFilePath)
    {
        this.audioFilePath = audioFilePath;
    }

    public Time getDuration()
    {
        return duration;
    }

    public void setDuration(Time duration)
    {
        this.duration = duration;
    }
}