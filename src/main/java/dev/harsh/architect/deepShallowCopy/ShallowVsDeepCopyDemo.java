package dev.harsh.architect.deepShallowCopy;

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    //copy constructor
    Person(Person person){
        this.name = person.name;
        this.address = new Address(person.address.toString()); // Deep copy
        //this.address = person.address; // Shallow copy
    }
    // Method to create a shallow copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }

    // Method to create a deep copy
    public Person deepCopy() {
        return new Person(this.name, new Address(this.address.city)); // Deep copy
    }
}

public class ShallowVsDeepCopyDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Create the original object
        Address address = new Address("Original City");
        Person original = new Person("John", address);

        // Create a shallow copy
        Person shallowCopy = (Person) original.clone();

        // Create a deep copy
        Person deepCopy = original.deepCopy();

        // copy constructor
        Person copyConstructor = new Person(original);

        // Modify the address in the shallow copy
        shallowCopy.address.city = "Shallow copy city";

        // Modify the address in the deep copy
        deepCopy.address.city = "Deep copy city";

        // Modify the address in the copy constructor
        copyConstructor.address.city = "Copy constructor city";


        // Print the cities to observe the changes
        System.out.println("Original Person's City: " + original.address.city); // Affected by shallow copy
        System.out.println("Shallow Copy's City: " + shallowCopy.address.city);
        System.out.println("Deep Copy's City: " + deepCopy.address.city); // Independent
        System.out.println("Copy Constructor's City: " + copyConstructor.address.city); // Independent
    }
}
