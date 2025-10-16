package com.musicmanager.web.controller;

import com.musicmanager.web.dto.request.SongRequest;
import com.musicmanager.web.model.Song;
import com.musicmanager.web.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/songs")
public class SongController
{
    @Autowired
    private SongService songService;

    @PostMapping
    Song createSong(@RequestBody SongRequest request)
    {
        return songService.createSong(request);
    }

    @GetMapping
    List<Song> getSongs()
    {
        return songService.getSongs();
    }

    @GetMapping("{id}")
    Song getSong(@PathVariable String id)
    {
        return songService.getSong(id);
    }

    @PutMapping("{id}")
    Song updateSong(@PathVariable String id, @RequestBody SongRequest request)
    {
        return songService.updateSong(id, request);
    }

    @DeleteMapping("{id}")
    String deleteSong(@PathVariable String id)
    {
        songService.deleteSong(id);
        return "Song has been deleted";
    }
}
