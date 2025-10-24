package com.musicmanager.web.service;

import com.musicmanager.web.entity.Genre;
import com.musicmanager.web.entity.Song;
import com.musicmanager.web.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
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

    // LẤY RA THÔNG TIN THỂ LOẠI NHẠC THEO ID
    // TODO: THÊM EXCEPTION
    public Genre getGenre(String id)
    {
        return genreRepository.findById(id).orElse(null);
    }

    // TÌM THỂ LOẠI NHẠC THEO TÊN (ĐẠI KHÁI)
    public List<Genre> searchGenresByName(String name)
    {
        return genreRepository.findByNameContainingIgnoreCase(name);
    }

    // TÌM THỂ LOẠI NHẠC THEO TÊN (CHÍNH XÁC)
    public Genre searchGenreByName(String name)
    {
        return genreRepository.findByNameIgnoreCase(name);
    }

    // Lấy ra danh sách bài hát của thể loại nhạc
    public List<Song> getGenreSongs(String id)
    {
        Genre genre = getGenre(id);

        if (genre != null)
        {
            return genre.getSongs();
        }

        return Collections.emptyList();
    }

    // TẠO THỂ LOẠI NHẠC MỚI
    // TODO: THÊM EXCEPTION
    public void createGenre(Genre request)
    {
        if (searchGenreByName(request.getName()) == null)
        {
            genreRepository.save(request);
        }
    }

    // SỬA THÔNG TIN THỂ LOẠI NHẠC
    // TODO: THÊM EXCEPTION
    public void updateGenre(String id, Genre request)
    {
        Genre genre = getGenre(id);
        Genre existingGenre = searchGenreByName(request.getName());

        if (existingGenre == null || existingGenre.getId().equals(id))
        {
            genre.setName(request.getName());
            genre.setInformations(request.getInformations());

            genreRepository.save(genre);
        }
    }

    // XÓA THỂ LOẠI NHẠC
    // TODO: THÊM EXCEPTION
    public void deleteGenre(String id)
    {
        genreRepository.deleteById(id);
    }

    // SỐ LƯỢNG THỂ LOẠI NHẠC CÓ TRONG DATABASE
    public long numberOfGenres()
    {
        return genreRepository.count();
    }

    // SỐ LƯỢNG BÀI HÁT TRONG THỂ LOẠI NHẠC
    // TODO: THÊM EXCEPTION
    public long numberOfGenreSongs(String id)
    {
        return getGenreSongs(id).size();
    }
}
