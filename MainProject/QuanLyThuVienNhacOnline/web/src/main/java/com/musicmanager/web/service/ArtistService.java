package com.musicmanager.web.service;

import com.musicmanager.web.entity.Artist;
import com.musicmanager.web.entity.Song;
import com.musicmanager.web.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ArtistService
{
    @Autowired
    private ArtistRepository artistRepository;

    // LẤY RA DANH SÁCH NGHỆ SĨ
    public List<Artist> getArtists()
    {
        return artistRepository.findAll();
    }

    // LẤY THÔNG TIN CỦA NGHỆ SĨ THEO ID
    // TODO: THÊM EXCEPTION
    public Artist getArtist(String id)
    {
        return artistRepository.findById(id).orElse(null);
    }

    // TÌM NGHỆ SĨ THEO TÊN (ĐẠI KHÁI)
    public List<Artist> searchArtistsByName(String name)
    {
        return artistRepository.findByNameContainingIgnoreCase(name);
    }

    // TÌM NGHỆ SĨ THEO TÊN (CHÍNH XÁC)
    public Artist searchArtistByName(String name)
    {
        return artistRepository.findByNameIgnoreCase(name);
    }

    // LẤY DANH SÁCH BÀI HÁT CỦA NGHỆ SĨ
    public List<Song> getArtistSongs(String id)
    {
        Artist artist = getArtist(id);

        if (artist != null)
        {
            return artist.getSongs();
        }

        return Collections.emptyList();
    }

    // TẠO NGHỆ SĨ MỚI
    // TODO: THÊM EXCEPTION
    public void createArtist(Artist request)
    {
        if (searchArtistByName(request.getName()) == null)
        {
            artistRepository.save(request);
        }
    }

    // SỬA THÔNG TIN NGHỆ SĨ
    // TODO: THÊM EXCEPTION
    public void updateArtist(String id, Artist request)
    {
        Artist artist = getArtist(id);
        Artist existingArtist = searchArtistByName(request.getName());
        if (existingArtist == null || existingArtist.getId().equals(id))
        {
            artist.setName(request.getName());
            artist.setCountry(request.getCountry());
            artist.setGender(request.getGender());
            artist.setInformations(request.getInformations());

            artistRepository.save(artist);
        }
    }

    // XÓA NGHỆ SĨ
    // TODO: THÊM EXCEPTION
    public void deleteArtist(String id)
    {
        artistRepository.deleteById(id);
    }

    // SỐ LƯỢNG NGHỆ SĨ CÓ TRONG DATABASE
    public long numberOfArtists()
    {
        return artistRepository.count();
    }

    // SỐ LƯỢNG BÀI HÁT CỦA NGHỆ SĨ
    // TODO: THÊM EXCEPTION
    public long numberOfArtistSongs(String id)
    {
        return getArtistSongs(id).size();
    }
}
