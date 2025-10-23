package com.musicmanager.web.controller;

import com.musicmanager.web.entity.Song;
import com.musicmanager.web.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/songs")
public class SongViewController {

    @Autowired
    private SongService songService;

    // Trang danh sách
    @GetMapping
    public String listSongs(Model model, @RequestParam(value = "keyword", required = false) String keyword) {
        model.addAttribute("songs", songService.searchSongs(keyword));
        model.addAttribute("keyword", keyword);
        model.addAttribute("newSong", new Song());
        return "songs";
    }

    // Tạo mới
    @PostMapping("/add")
    public String addSong(@ModelAttribute Song song) {
        songService.createSong(song);
        return "redirect:/songs";
    }

    // Xóa
    @GetMapping("/delete/{id}")
    public String deleteSong(@PathVariable String id) {
        songService.deleteSong(id);
        return "redirect:/songs";
    }

    // Cập nhật
    @PostMapping("/update/{id}")
    public String updateSong(@PathVariable String id, @ModelAttribute Song song) {
        songService.updateSong(id, song);
        return "redirect:/songs";
    }
}
