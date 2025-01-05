package dev.prakhar.architect.designpattern;

public class Main {
    public static void main(String[] args) {
        Car car = Car.builder()
                .setBrand("Hello")
                .setId(123)
                .build();
        System.out.println(car);
    }
}
