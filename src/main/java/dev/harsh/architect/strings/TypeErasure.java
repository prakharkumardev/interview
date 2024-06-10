package dev.harsh.architect.strings;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class TypeErasure {
    @Getter
    @Setter
    public static class MyInnerClass<T extends String>{
        private T value;

    }
    public static void main(String[] args) {
        List<Number> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        //At compile time type is erased and it is made to List list = new ArrayList();
        //For type safety compiler at comiple time makes sure correct value is placed
        //At runtime no info about datatype is present
        MyInnerClass<String> myInnerClass = new MyInnerClass<>();
        myInnerClass.setValue("Hello!");
        System.out.println(myInnerClass.getValue());

    }
}
