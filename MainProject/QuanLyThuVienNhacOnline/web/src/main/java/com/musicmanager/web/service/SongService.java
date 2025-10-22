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

    public Song createSong(SongRequest request)// tao bai hat moi//
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

    public List<Song> getSongs()// lay bài hát theo yêu cầu//
    {
        return songRepository.findAll().stream()
                .filter(song -> id == null || id.isBlank() || song.getId().equals(id))
                .filter(song -> title == null || title.isBlank() || song.getTitle().toLowerCase().contains(title.toLowerCase()))
                .filter(song -> artist == null || artist.isBlank() || song.getArtist().getName().toLowerCase().contains(artist.toLowerCase()))
                .filter(song -> genre == null || genre.isBlank() || song.getGenre().getName().toLowerCase().contains(genre.toLowerCase()))
                .filter(song -> releaseYear == null || song.getReleaseYear().equals(releaseYear))
                .colect(Collectors.toList());
    }

    
    public Song updateSong(String id, SongRequest request)// cap nhat thong tin bai hat theo id//
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

    public void deleteSong(String id)// xoa bai hat theo id //
    {
        songRepository.deleteById(id);
    }
}
