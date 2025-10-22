package com.musicmanager.web.repository;

import com.musicmanager.web.entity.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, String>
{
    List<Artist> findByName(String name);
}
