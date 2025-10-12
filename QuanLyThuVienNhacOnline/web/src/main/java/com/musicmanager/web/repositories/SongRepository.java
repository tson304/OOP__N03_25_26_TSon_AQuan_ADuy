package com.musicmanager.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.musicmanager.web.models.Song;

public interface SongRepository extends JpaRepository<Song, Long> {}
