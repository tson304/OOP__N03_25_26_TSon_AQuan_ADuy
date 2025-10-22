package com.musicmanager.web.service;

import com.musicmanager.web.entity.Artist;
import com.musicmanager.web.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistService
{
    @Autowired
    private ArtistRepository artistRepository;

    // TẠO NGHỆ SĨ MỚI
    public void createArtist(Artist request)
    {
        Artist artist = new Artist();
        artist.setName(request.getName());
        artist.setCountry(request.getCountry());
        artist.setGender(request.getGender());
        artist.setInformations(request.getInformations());

        artistRepository.save(artist);
    }

    // LẤY RA DANH SÁCH NGHỆ SĨ
    public List<Artist> getArtists()
    {
        return artistRepository.findAll();
    }

    // LẤY THÔNG TIN NGHỆ SĨ THEO ID
    public Artist getArtist(String id)
    {
        return artistRepository.findById(id).orElse(null);
    }

    // TÌM NGHỆ SĨ THEO TÊN
    public List<Artist> searchArtist(String name)
    {
        return artistRepository.findByName(name);
    }

    // SỬA ĐỔI THÔNG TIN NGHỆ SĨ
    public void updateArtist(String id, Artist request)
    {
        Artist artist = getArtist(id);

        if (artist != null)
        {
            artist.setName(request.getName());
            artist.setCountry(request.getCountry());
            artist.setGender(request.getGender());
            artist.setInformations(request.getInformations());

            artistRepository.save(artist);
        }
    }

    // XÓA NGHỆ SĨ
    public void deleteArtist(String id)
    {
        artistRepository.deleteById(id);
    }
}
