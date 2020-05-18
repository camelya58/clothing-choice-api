package com.github.camelya58.clothing_choice.repositories;

import com.github.camelya58.clothing_choice.models.ClothingChoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClothingChoiceRepository extends JpaRepository<ClothingChoice, String> {
}
