package com.example.clothing_choice.models;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private String id;
    private String name;
    private City location;
    private String login;
    private String password;
    private String eMail;
    private List<City> cities;
    private UserType type;
}
