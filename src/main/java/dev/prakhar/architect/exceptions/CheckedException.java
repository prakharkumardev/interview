package dev.prakhar.architect.exceptions;

import java.io.NotActiveException;
import java.util.Random;

public class CheckedException {
    public static Object findStudentByRollNumber(int roll) throws NotActiveException {
        int c = roll/0;
        if(roll < 30 ){
            return new Object();
        }

        Random random = new Random();
        int rand = random.nextInt();
        if(rand % 2 == 0){
            throw new NotActiveException();
        }
        throw new ClassCastException();
    }

    public static void main(String[] args){
        try{
            findStudentByRollNumber(10);
        }
        catch (ClassCastException | NotActiveException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Always called");
        }

    }

}
