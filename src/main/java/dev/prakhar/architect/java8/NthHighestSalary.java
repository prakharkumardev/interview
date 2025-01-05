package dev.prakhar.architect.java8;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NthHighestSalary {
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
        List<FunctionInterfaceTest.Employee> employees = Stream.of(
                new FunctionInterfaceTest.Employee(1,"Basant","DEV",500000),
                new FunctionInterfaceTest.Employee(8, "santosh","DEV", 80000),
                new FunctionInterfaceTest.Employee(3, "pratik", "QA",60000),
                new FunctionInterfaceTest.Employee(9,"Harsh","DEVOPS",40000),
                new FunctionInterfaceTest.Employee(9 , "Dipak","QA", 90000)
        ).toList();
        Map<String,Long> map = new HashMap<>();
        employees.forEach((employee -> map.put(employee.getName(),employee.getSalary())));
        System.out.println(map);
        List<Map.Entry<Long, List<String>>> result = map.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet()
                .stream()
                .sorted(Comparator.comparingLong(Map.Entry::getKey))
                .skip(0)
                .limit(1)
                .toList();
        System.out.println(result);
    }
}
