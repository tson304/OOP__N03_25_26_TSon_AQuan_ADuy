package com.musicmanager.web.service;

import com.musicmanager.web.dto.request.ArtistRequest;
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
    public void createArtist(ArtistRequest request)
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
        return artistRepository.findById(id).orElseThrow(() -> new RuntimeException("Artists not found"));
    }

    // SỬA ĐỔI THÔNG TIN NGHỆ SĨ
    public void updateArtist(String id, ArtistRequest request)
    {
        Artist artist = getArtist(id);

        if (request.getName() != null)
        {
            artist.setName(request.getName());
        }
        if (request.getCountry() != null)
        {
            artist.setCountry(request.getCountry());
        }
        if (request.getGender() != null)
        {
            artist.setGender(request.getGender());
        }
        if (request.getInformations() != null)
        {
            artist.setInformations(request.getInformations());
        }

        artistRepository.save(artist);
    }

    // XÓA NGHỆ SĨ
    public void deleteArtist(String id)
    {
        artistRepository.deleteById(id);
    }
}
