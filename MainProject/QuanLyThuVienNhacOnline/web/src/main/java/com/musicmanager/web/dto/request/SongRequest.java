package com.musicmanager.web.dto.request;

import java.sql.Time;

public class SongRequest
{
    private String title;
    private String artistId;
    private String genreId;
    private Integer releaseYear;
    private String audioFilePath;
    private Time duration;

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getArtistId()
    {
        return artistId;
    }

    public void setArtistId(String artistId)
    {
        this.artistId = artistId;
    }

    public String getGenreId()
    {
        return genreId;
    }

    public void setGenreId(String genreId)
    {
        this.genreId = genreId;
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