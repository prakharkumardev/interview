package dev.harsh.architect.exceptions;

public class Errors {
    public static void call(int a){
        call(a-1);
    }
    public static void main(String[] args) {
        try{
            call(10);
        }
        catch (Error e){
            System.out.println(e.getStackTrace());
        }

    }
}
