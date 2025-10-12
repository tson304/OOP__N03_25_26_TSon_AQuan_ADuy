package com.musicmanager.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.musicmanager.web.models.Artist;

public interface ArtistRepository extends JpaRepository<Artist, Long> {}
