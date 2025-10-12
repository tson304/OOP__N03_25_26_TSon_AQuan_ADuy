package com.musicmanager.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.musicmanager.web.models.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {}
