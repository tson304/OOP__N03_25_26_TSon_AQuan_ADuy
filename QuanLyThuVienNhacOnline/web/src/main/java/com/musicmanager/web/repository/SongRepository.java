package com.musicmanager.web.repository;

import com.musicmanager.web.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SongRepository extends JpaRepository<Song, String> {}
