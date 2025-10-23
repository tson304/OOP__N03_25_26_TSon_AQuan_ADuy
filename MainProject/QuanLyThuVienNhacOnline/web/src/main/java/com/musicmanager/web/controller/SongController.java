package com.musicmanager.web.controller;

import com.musicmanager.web.entity.Song;
import com.musicmanager.web.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/songs")
@CrossOrigin(origins = "*") 
public class SongController {

    @Autowired
    private SongService songService;

    // CREATE
    @PostMapping
    public Song createSong(@RequestBody Song song) {
        return songService.createSong(song);
    }

    // READ - tất cả bài hát
    @GetMapping
    public List<Song> getAllSongs() {
        return songService.getAllSongs();
    }

    // READ - 1 bài hát
    @GetMapping("/{id}")
    public Song getSong(@PathVariable String id) {
        return songService.getSong(id);
    }

    // SEARCH
    @GetMapping("/search")
    public List<Song> searchSongs(@RequestParam(required = false) String title,
                                  @RequestParam(required = false) String artist,
                                  @RequestParam(required = false) String genre) {
        return songService.searchSongs(title, artist, genre);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Song updateSong(@PathVariable String id, @RequestBody Song song) {
        return songService.updateSong(id, song);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteSong(@PathVariable String id) {
        songService.deleteSong(id);
        return "Đã xóa bài hát với id: " + id;
    }
}
