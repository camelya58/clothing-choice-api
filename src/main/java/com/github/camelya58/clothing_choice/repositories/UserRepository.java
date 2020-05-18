package com.github.camelya58.clothing_choice.repositories;

import com.github.camelya58.clothing_choice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
