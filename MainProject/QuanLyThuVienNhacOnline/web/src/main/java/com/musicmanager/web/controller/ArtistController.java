package com.musicmanager.web.controller;

import com.musicmanager.web.dto.request.ArtistRequest;
import com.musicmanager.web.model.Artist;
import com.musicmanager.web.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artists")
public class ArtistController
{
    @Autowired
    private ArtistService artistService;

    @PostMapping
    Artist createArtist(@RequestBody ArtistRequest request)
    {
        return artistService.createArtist(request);
    }

    @GetMapping
    List<Artist> getArtists()
    {
        return artistService.getArtists();
    }

    @GetMapping("/{id}")
    Artist getArtist(@PathVariable String id)
    {
        return artistService.getArtist(id);
    }

    @PutMapping("/{id}")
    Artist updateArtist(@PathVariable String id, @RequestBody ArtistRequest request)
    {
        return artistService.updateArtist(id, request);
    }

    @DeleteMapping("/{id}")
    String deleteArtist(@PathVariable String id)
    {
        artistService.deleteArtist(id);
        return "Artist has been deleted";
    }

}
