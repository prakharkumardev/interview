package dev.harsh.architect.immutableClass;

import java.util.ArrayList;
import java.util.List;

/*
An immutable class in Java is a class whose objects cannot be modified
 once they are created. Any modification to the object results in the
  creation of a new object.
  Examples of immutable classes include String, Integer, and BigDecimal.

Steps:
	1.	Declare the class as final
	2.	Make all fields private and final
	3.	Do not provide setters
	4.	Initialize fields through a constructor
	5.	Ensure deep copy of mutable fields
	6.	Provide getter methods but no setter methods

 */
public final class ImmutableClass {
    private final int value;
    private final List<Integer> list;

    public ImmutableClass(int value, List<Integer> list){
        this.value = value;
        this.list = list;
    }
    public int getValue(){
        return value;
    }
    public List<Integer> getList(){
        //here we return a new arraylist to ensure that the list remains immuatable
        return new ArrayList<>(list);
    }
    // Immutable method
    public ImmutableClass addItem(int item) {
        List<Integer> newItems = new ArrayList<>(list); // Create a copy
        newItems.add(item); // Modify the copy
        return new ImmutableClass(value,newItems); // Return a new object
    }



}
