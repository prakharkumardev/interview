package dev.harsh.architect.exceptions;

public class Test {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }
        finally {
            System.out.println("Hello world!!!");
        }
    }
}
