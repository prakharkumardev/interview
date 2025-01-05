package dev.prakhar.architect.generics;

import java.util.ArrayList;
import java.util.List;

public class MethodLevelGenerics {
    public static <T> T getValue(T param){
        return param;
    }
    public static <T extends Number> T upperBoundValue(T param){
        return param;
    }

    public static void main(String[] args) {
        System.out.println(getValue("Hi"));
        System.out.println(upperBoundValue(123));
    }
}
