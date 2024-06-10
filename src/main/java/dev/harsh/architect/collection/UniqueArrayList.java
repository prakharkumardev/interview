package dev.harsh.architect.collection;

import java.util.ArrayList;

public class UniqueArrayList<T> extends ArrayList<T> {
    @Override
    public boolean add(T t) {
        if(this.contains(t)){
            return true;
        }
        return super.add(t);
    }

}