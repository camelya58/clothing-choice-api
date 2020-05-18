package com.github.camelya58.clothing_choice.models;

import lombok.Data;

@Data
public class ClothingChoice {
    private String id;
    private ClothingType clothe;
    private HeaddressType headdress;
    private OverdressType overdress;
    private boolean umbrella;

}
