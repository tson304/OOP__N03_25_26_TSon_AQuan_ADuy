package com.musicmanager.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.musicmanager.web.model.Song;

public interface SongRepository extends JpaRepository<Song, Long> {
}
