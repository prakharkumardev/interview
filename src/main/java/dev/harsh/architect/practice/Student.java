package dev.harsh.architect.practice;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student implements Comparable<Student>{
    private String name;
    private Integer age;
    private Double marks;
    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Student)) return false;
        return this.name.equals(((Student) obj).name);
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(o.age,this.age);
    }
}
