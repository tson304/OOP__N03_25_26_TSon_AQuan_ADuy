package com.musicmanager.web.service;

import com.musicmanager.web.dto.request.GenreRequest;
import com.musicmanager.web.entity.Genre;
import com.musicmanager.web.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreService
{
    @Autowired
    private GenreRepository genreRepository;

    public Genre createGenre(GenreRequest request)
    {
        Genre genre = new Genre();

        genre.setName(request.getName());

        return genreRepository.save(genre);
    }

    public List<Genre> getGenres()
    {
        return genreRepository.findAll();
    }

    public Genre getGenre(String id)
    {
        return genreRepository.findById(id).orElseThrow(() -> new RuntimeException("Genre not found"));
    }

    public Genre updateGenre(String id, GenreRequest request)
    {
        Genre genre = getGenre(id);

        genre.setName(request.getName());

        return genreRepository.save(genre);
    }

    public void deleteGenre(String id)
    {
        genreRepository.deleteById(id);
    }
}
