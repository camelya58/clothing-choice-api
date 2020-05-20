package com.github.camelya58.clothing_choice.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String name;
    @OneToOne
    private City location;
    private String login;
    private String password;
    private String eMail;

    //private List<City> cities;
    private UserType type;
}
