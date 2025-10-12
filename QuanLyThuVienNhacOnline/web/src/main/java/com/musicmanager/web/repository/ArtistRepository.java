package com.musicmanager.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.musicmanager.web.model.Artist;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
