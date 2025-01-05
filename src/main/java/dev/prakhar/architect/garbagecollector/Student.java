package dev.prakhar.architect.garbagecollector;

public class Student {
    public static void main(String[] args) throws InterruptedException {
        Runtime.getRuntime().gc();
        System.out.println("Garbage collector called");

        //OR
        System.gc();
        System.out.println("Garbage collector called");

    }
}
