package com.musicmanager.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.musicmanager.web.model.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
