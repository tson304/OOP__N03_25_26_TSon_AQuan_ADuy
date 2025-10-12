package com.musicmanager.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.musicmanager.web.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
