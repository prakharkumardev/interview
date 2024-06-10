package dev.harsh.architect.collection;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student implements Comparable<Student>{
    private int age;
    private String name;
    private int marks;
    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Student)){
            return false;
        }
        return ((Student) obj).age == this.age;
    }

    @Override
    public int compareTo(Student o) {
        if(this.age == o.age){
            return Integer.compare(this.marks,o.marks);
        }
        return Integer.compare(this.age,o.age);
    }
}