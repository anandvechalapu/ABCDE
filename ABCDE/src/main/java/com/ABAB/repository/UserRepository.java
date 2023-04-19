package com.ABAB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ABAB.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
    User findByEmail(String email);
    User findByPassword(String password);
    User findByUsernameAndPassword(String username, String password);
    User findByResetToken(String resetToken);
}