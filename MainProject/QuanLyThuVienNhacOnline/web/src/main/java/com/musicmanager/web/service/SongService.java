package com.musicmanager.web.service;

import com.musicmanager.web.dto.request.SongRequest;
import com.musicmanager.web.entity.Artist;
import com.musicmanager.web.entity.Genre;
import com.musicmanager.web.entity.Song;
import com.musicmanager.web.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService
{
    @Autowired
    private SongRepository songRepository;
    @Autowired
    private ArtistService artistService;
    @Autowired
    private GenreService genreService;

    public Song createSong(SongRequest request)
    {
        Artist artist = artistService.getArtist(request.getArtistId());
        Genre genre = genreService.getGenre(request.getGenreId());
        Song song = new Song();

        song.setTitle(request.getTitle());
        song.setArtist(artist);
        song.setGenre(genre);
        song.setReleaseYear(request.getReleaseYear());
        song.setAudioFilePath(request.getAudioFilePath());
        song.setDuration(request.getDuration());

        return songRepository.save(song);
    }

    public List<Song> getSongs()
    {
        return songRepository.findAll();
    }

    public Song getSong(String id)
    {
        return songRepository.findById(id).orElseThrow(() -> new RuntimeException("Song not found"));
    }

    public Song updateSong(String id, SongRequest request)
    {
        Song song = getSong(id);

        if (request.getTitle() != null)
        {
            song.setTitle(request.getTitle());
        }
        if (request.getArtistId() != null)
        {
            Artist artist = artistService.getArtist(request.getArtistId());
            song.setArtist(artist);
        }
        if (request.getGenreId() != null)
        {
            Genre genre = genreService.getGenre(request.getGenreId());
            song.setGenre(genre);
        }
        if (request.getReleaseYear() != null)
        {
            song.setReleaseYear(request.getReleaseYear());
        }
        if (request.getAudioFilePath() != null)
        {
            song.setAudioFilePath(request.getAudioFilePath());
        }
        if (request.getDuration() != null)
        {
            song.setDuration(request.getDuration());
        }

        return songRepository.save(song);
    }

    public void deleteSong(String id)
    {
        songRepository.deleteById(id);
    }
}
