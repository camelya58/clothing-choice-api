package com.example.clothing_choice.models;

import lombok.Data;

@Data
public class ClothingChoice {
    private ClothingType clothe;
    private HeaddressType headdress;
    private OverdressType overdress;
    private boolean umbrella;

}
