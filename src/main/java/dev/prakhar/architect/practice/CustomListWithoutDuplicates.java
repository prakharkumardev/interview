package dev.prakhar.architect.practice;

import java.util.ArrayList;

public class CustomListWithoutDuplicates<T> extends ArrayList<T> {
    @Override
    public boolean add(T t) {
        if(this.contains(t)){
            return false;
        }
        return super.add(t);
    }
}
