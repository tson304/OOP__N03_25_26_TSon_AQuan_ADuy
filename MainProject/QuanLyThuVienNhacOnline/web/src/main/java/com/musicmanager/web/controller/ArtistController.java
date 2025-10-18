package com.musicmanager.web.controller;

import com.musicmanager.web.dto.request.ArtistRequest;
import com.musicmanager.web.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/artists")
public class ArtistController
{
    @Autowired
    private ArtistService artistService;

    @GetMapping
    public String readArtists(Model model)
    {
        model.addAttribute("artists", artistService.getArtists());
        model.addAttribute("artistRequest", new ArtistRequest());
        return "artists";
    }

    @PostMapping("/create")
    public String createArtist(@ModelAttribute("artistRequest") ArtistRequest request)
    {
        artistService.createArtist(request);
        return "redirect:/artists";
    }

    @PostMapping("/update/{id}")
    public String updateArtist(@PathVariable String id, @ModelAttribute ArtistRequest request)
    {
        artistService.updateArtist(id, request);
        return "redirect:/artists";
    }

    @GetMapping("/delete/{id}")
    public String deleteArtist(@PathVariable String id)
    {
        artistService.deleteArtist(id);
        return "redirect:/artists";
    }
}
