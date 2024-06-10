package dev.harsh.architect.generics;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class ClassLevelGenerics {
    @Getter
    @Setter
    @AllArgsConstructor
    @ToString
    public static class SimpleGeneric<T>{
        private T value;
    }

    @Getter
    @Setter
    @ToString
    @AllArgsConstructor
    public static class UpperBound<T extends Number>{
        private T value;
    }

    public static void main(String[] args) {
        SimpleGeneric<String> simpleGeneric = new SimpleGeneric<>("Hello World!");
        UpperBound<Integer> upperBound = new UpperBound<>(123);
        System.out.println(simpleGeneric);
        System.out.println(upperBound);
    }
}
