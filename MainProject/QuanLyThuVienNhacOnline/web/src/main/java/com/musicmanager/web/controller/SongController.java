package com.musicmanager.web.controller;

import com.musicmanager.web.entity.Song;
import com.musicmanager.web.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/songs")
public class SongController {

    @Autowired
    private SongService songService;

    // Tạo mới bài hát
    @PostMapping
    public Song createSong(@RequestBody Song song) {
        return songService.createSong(song);
    }

    // Lấy bài hát theo id
    @GetMapping("{id}")
    public Song getSong(@PathVariable String id) {
        return songService.getSong(id);
    }

    // Lấy tất cả bài hát
    @GetMapping
    public List<Song> getSongs() {
        return songService.getSongs(null, null, null, null, null);
    }

    // Tìm kiếm bài hát theo điều kiện
    @GetMapping("/search")
    public List<Song> searchSongs(@RequestParam(required = false) String id,
                                  @RequestParam(required = false) String title,
                                  @RequestParam(required = false) String artist,
                                  @RequestParam(required = false) String genre,
                                  @RequestParam(required = false) Integer releaseYear) {
        return songService.getSongs(id, title, artist, genre, releaseYear);
    }

    // Cập nhật bài hát theo id
    @PutMapping("{id}")
    public Song updateSong(@PathVariable String id, @RequestBody Song song) {
        return songService.updateSong(id, song);
    }

    // Xóa bài hát theo id
    @DeleteMapping("{id}")
    public String deleteSong(@PathVariable String id) {
        songService.deleteSong(id);
        return "Đã xóa bài hát với id: " + id;
    }
}