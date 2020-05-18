package com.github.camelya58.clothing_choice.repositories;

import com.github.camelya58.clothing_choice.models.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository <City, String> {
}
