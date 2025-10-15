package com.musicmanager.web.repository;

import com.musicmanager.web.model.Artist;
import com.musicmanager.web.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public interface UserRepository extends JpaRepository<User, String> {}