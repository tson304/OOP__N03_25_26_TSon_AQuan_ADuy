package com.musicmanager.web.service;

import com.musicmanager.web.dto.request.ArtistRequest;
import com.musicmanager.web.model.Artist;
import com.musicmanager.web.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ArtistService {
    @Autowired
    private ArtistRepository artistRepository;

    public Artist createArtist(ArtistRequest request) {
        Artist artist = new Artist();

        artist.setName(request.getName());
        artist.setCountry(request.getCountry());

        return artistRepository.save(artist);
    }

    public List<Artist> getArtists() {
        return artistRepository.findAll();
    }

    public Artist getArtist(String id) {
        return artistRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    public Artist updateArtist(String id, ArtistRequest request) {
        Artist artist = getArtist(id);

        artist.setName(request.getName());
        artist.setCountry(request.getCountry());

        return  artistRepository.save(artist);
    }

    public void deleteArtist(String id) {
        artistRepository.deleteById(id);
    }



}
