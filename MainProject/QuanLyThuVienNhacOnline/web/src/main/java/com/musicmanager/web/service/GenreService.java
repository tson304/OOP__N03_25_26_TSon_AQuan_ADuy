package com.musicmanager.web.service;

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

    // LẤY RA DANH SÁCH THỂ LOẠI NHẠC
    public List<Genre> getGenres()
    {
        return genreRepository.findAll();
    }

    // TÌM THỂ LOẠI NHẠC THEO TÊN
    public List<Genre> searchGenres(String name)
    {
        return genreRepository.findByName(name);
    }

    // TẠO THỂ LOẠI NHẠC MỚI
    public void createGenre(Genre request)
    {
        if (searchGenres(request.getName()).isEmpty())
        {
            Genre genre = new Genre();

            genre.setName(request.getName());

            genreRepository.save(genre);
        }
    }

    // SỬA THỂ LOẠI NHẠC
    public void updateGenre(String id, Genre request)
    {
        Genre genre = getGenre(id);

        if (genre != null)
        {
            genre.setName(request.getName());
            genreRepository.save(genre);
        }
    }

    // XÓA THỂ LOẠI NHẠC
    public void deleteGenre(String id)
    {
        Genre genre = getGenre(id);

        if (genre != null)
        {
            genreRepository.deleteById(id);
        }
    }


    // LẤY RA DANH SÁCH THỂ LOẠI NHẠC THEO ID
    public Genre getGenre(String id)
    {
        return genreRepository.findById(id).orElse(null);
    }

    // SỐ LƯỢNG THỂ LOẠI NHẠC CÓ TRONG DATABASE
    public Long numberOfGenres()
    {
        return genreRepository.count();
    }
}
