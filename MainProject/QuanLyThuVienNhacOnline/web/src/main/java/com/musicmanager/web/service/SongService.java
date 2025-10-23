package com.musicmanager.web.service;

import com.musicmanager.web.entity.Artist;
import com.musicmanager.web.entity.Genre;
import com.musicmanager.web.entity.Song;
import com.musicmanager.web.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;

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

  public Song createSong(Song song)// tao mot bai hat//
    {
        return songRepository.save(song);   
}


    public List<Song> getSongs(String id,String title,String artist,String genre,Integer releaseYear)// lay bài hát theo yêu cầu//
    {
        return songRepository.findAll().stream()
                .filter(song -> id == null || id.isBlank() || song.getId().equals(id))
                .filter(song -> title == null || title.isBlank() || song.getTitle().toLowerCase().contains(title.toLowerCase()))
                .filter(song -> artist == null || artist.isBlank() || song.getArtist().getName().toLowerCase().contains(artist.toLowerCase()))
                .filter(song -> genre == null || genre.isBlank() || song.getGenre().getName().toLowerCase().contains(genre.toLowerCase()))
                .filter(song -> releaseYear == null || song.getReleaseYear().equals(releaseYear))
                .collect(Collectors.toList());
    }

    
    public Song updateSong(String id, Song request)// cap nhat thong tin bai hat theo id//
    {
        Song song = getSong(id);

        if (request.getTitle() != null)
        {
            song.setTitle(request.getTitle());
        }
       if (request.getArtist() != null) {
            song.setArtist(request.getArtist());
        }
        if (request.getGenre() != null) {
           song.setGenre(request.getGenre());
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
    public Song getSong(String id) {
    return songRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Không tìm thấy bài hát với id: " + id));
}


}
