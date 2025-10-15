package com.musicmanager.web.service;

import com.musicmanager.web.dto.request.SongRequest;
import com.musicmanager.web.model.Song;
import com.musicmanager.web.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SongService {
    @Autowired
    private SongRepository songRepository;

    public Song createSong(SongRequest request) {
        Song song = new Song();

        song.setName(request.getName());
        song.setArtist(request.getArtist());
        song.setGenre(request.getGenre());
        song.setReleaseYear(request.getReleaseYear());
        song.setAudioFilePath(request.getAudioFilePath());
        song.setDuration(request.getDuration());

        return songRepository.save(song);
    }

    public List<Song> getSongs() {
        return songRepository.findAll();
    }

    public Song getSong(String id) {
        return songRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    public Song updateSong(String id, SongRequest request) {
        Song song = getSong(id);

        song.setName(request.getName());
        song.setArtist(request.getArtist());
        song.setGenre(request.getGenre());
        song.setReleaseYear(request.getReleaseYear());
        song.setAudioFilePath(request.getAudioFilePath());
        song.setDuration(request.getDuration());

        return songRepository.save(song);
    }

    public void deleteSong(String id) {
        songRepository.deleteById(id);
    }
}
