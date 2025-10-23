package com.musicmanager.web.controller;

import com.musicmanager.web.entity.Artist;
import com.musicmanager.web.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/artists")
public class ArtistController
{
    @Autowired
    private ArtistService artistService;

    @GetMapping
    public String getArtists(Model model)
    {
        model.addAttribute("artists", artistService.getArtists());
        model.addAttribute("artistRequest", new Artist());
        return "artists";
    }

    @GetMapping("/search")
    public String searchArtists(@RequestParam("name") String name, Model model) {
        List<Artist> artists = artistService.searchArtist(name);
        model.addAttribute("artists", artists);
        model.addAttribute("searchQuery", name);
        model.addAttribute("artistRequest", new Artist());
        return "artists";
    }

    @PostMapping("/create")
    public String createArtist(@ModelAttribute("artistRequest") Artist request)
    {
        artistService.createArtist(request);
        return "redirect:/artists";
    }

    @PostMapping("/update/{id}")
    public String updateArtist(@PathVariable String id, @ModelAttribute("artistRequest") Artist request)
    {
        artistService.updateArtist(id, request);
        return "redirect:/artists";
    }

    @PostMapping("/delete/{id}")
    public String deleteArtist(@PathVariable String id)
    {
        artistService.deleteArtist(id);
        return "redirect:/artists";
    }
}
