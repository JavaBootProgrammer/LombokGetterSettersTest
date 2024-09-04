package com.google;

import com.google.vehcle.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GettersSettersLombokApplication {

    public static void main(String[] args) {
        SpringApplication.run(GettersSettersLombokApplication.class, args);

        Car car = new Car("1","Honda","Civic");
        System.out.println(car.toString());
        System.out.println("---------------");
        car.setId("2");
        car.setMake("Toyota");
        System.out.println(car.getId());
        System.out.println(car.getMake());

    }

}
