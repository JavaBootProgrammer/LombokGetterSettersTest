package com.google.vehcle;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Car {
    private String id;
    private String make;
    private String model;


    public Car(String id, String make, String model) {
        this.id = id;
        this.make = make;
        this.model = model;
    }

}
