package com.github.camelya58.clothing_choice.models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class WeatherForecast {
    private String id;
    private City city;
    private double temperature;
    private int windSpeed;
    private WeatherType weather;
    private ClothingChoice choice;
    private int timePeriod; // нужно изменить тип на TimePeriod в transfers
    private LocalDateTime localDateTime;
}
