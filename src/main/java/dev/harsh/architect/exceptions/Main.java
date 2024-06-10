package dev.harsh.architect.exceptions;

public class Main {
    public static int divide(int a,int b){
        return a/b;
    }
    public static void main(String[] args) {
        System.out.println(divide(1,0));
    }
}
