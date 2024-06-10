package dev.harsh.architect.java8;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class FunctionInterfaceTest {
    public static boolean greaterThan4(int val){
        return val > 4;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @ToString
    public static class Employee{
        private long id;
        private String name;
        private String Department;
        private long salary;
    }

    public static void main(String[] args) {
        Function<Integer,String> function = (i) -> i + "out";
        System.out.println(function.apply(10));
        Stream<Integer> stream = Stream.of(23,4,6,8,9,1,2,10);
        List<Integer> out = stream.filter(FunctionInterfaceTest::greaterThan4).sorted().toList();
        System.out.println(out);
        List<List<Integer>> list = Arrays.asList(new ArrayList<>(Arrays.asList(1,2,3,4,5)),Arrays.asList(3,2,5,1));
        System.out.println(list.stream().flatMap(Collection::stream).toList());

        String input = "Haarsh";
        Map<String,Long> o = Arrays.stream(input.split("")).collect(Collectors.groupingBy((a)->a,Collectors.counting()));
        System.out.println(o);

        List<Employee> employees = Stream.of(
                new Employee(1,"Basant","DEV",500000),
                new Employee(8, "santosh","DEV", 80000),
                new Employee(3, "pratik", "QA",60000),
                new Employee(9,"Harsh","DEVOPS",40000),
                new Employee(9 , "Dipak","QA", 90000)
        ).toList();

        Map<String, Optional<Employee>> output = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingLong(Employee::getSalary))));
        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),Optional::get)));
        System.out.println(output);
    }
}
