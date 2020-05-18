package com.github.camelya58.clothing_choice.repositories;

import com.github.camelya58.clothing_choice.models.WeatherForecast;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherForecastRepository extends JpaRepository<WeatherForecast, String> {
}
