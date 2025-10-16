package com.musicmanager.web.controller;

import com.musicmanager.web.dto.request.GenreRequest;
import com.musicmanager.web.entity.Genre;
import com.musicmanager.web.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/genres")
public class GenreController
{
    @Autowired
    private GenreService genreService;

    @PostMapping
    Genre createGenre(@RequestBody GenreRequest request)
    {
        return genreService.createGenre(request);
    }

    @GetMapping
    List<Genre> getGenres()
    {
        return genreService.getGenres();
    }

    @GetMapping("{id}")
    Genre getGenre(@PathVariable String id)
    {
        return genreService.getGenre(id);
    }

    @PutMapping("{id}")
    Genre updateGenre(@PathVariable String id, @RequestBody GenreRequest request)
    {
        return genreService.updateGenre(id, request);
    }

    @DeleteMapping("{id}")
    String deleteGenre(@PathVariable String id)
    {
        genreService.deleteGenre(id);
        return "Genre has been deleted";
    }
}
