package dev.prakhar.architect.designpattern;

import lombok.ToString;

import java.util.Date;
@ToString

public class Car {
    private Long id;
    private String brand;
    private int noOfDoors;
    private Date manufacturing;
    private boolean hasBluetooth;
    public static class CarBuilder{
        private Car car = new Car();
        public CarBuilder setId(long id){
            car.id = id;
            return this;
        }
        public CarBuilder setBrand(String brand){
            car.brand = brand;
            return this;
        }
        public Car build(){
            //Method validation
            if(car.id == null || car.brand == null){
                throw new RuntimeException();
            }
            //Addition for validation
            return car;
        }


    }
    public static CarBuilder builder(){
        return new CarBuilder();
    }


}
