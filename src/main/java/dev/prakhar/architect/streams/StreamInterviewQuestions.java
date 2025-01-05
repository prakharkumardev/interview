package dev.prakhar.architect.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamInterviewQuestions {
    public static class GreaterThan5{
        public static void main(String[] args) {
            List<String> numbers = List.of("harsh","apple","banana","grape","watermelon","kiwi");
            System.out.println(numbers.stream().filter((a)->a.length() > 5).count());

        }
    }

    public static class SumOfEven {
        public static void main(String[] args) {
            List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
            System.out.println(numbers.stream().filter((a)->((a & 1)) == 0).mapToInt(Integer::intValue).sum());
            //So operations like sum,avg,max,min like sql can be performed on map to int conversion as it converts stream to intstream
        }
    }

    public static class SquaredList{
        public static void main(String[] args) {
            List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
            System.out.println(numbers.stream().map((a)->a * a).collect(Collectors.toList()));
        }
    }
    public static class MaxiElement{
        //here the max() returns an optionalInt and to get value we have to write getAsInt
        public static void main(String[] args) {
            List<Integer> numbers = List.of(10,5,25,15,30);
            System.out.println(numbers.stream().mapToInt(Integer::intValue).max().getAsInt());
        }
    }

    public static class ConcatToSingle{
        public static void main(String[] args) {
            List<String> fruits = List.of("harsh","apple","banana","grape","watermelon","kiwi");
            String out = fruits.stream().collect(Collectors.joining());
            System.out.println(out);
            String out2 = fruits.stream().reduce("",(x,y)->x+y);
            System.out.println(out2.equals(out2));
        }
    }

    public static class ConvertToUpperCaseAndSort{
        public static void main(String[] args) {
            List<String> fruits = List.of("harsh","apple","banana","grape","watermelon","kiwi");
            System.out.println(fruits.stream().map(String::toUpperCase).sorted().toList());
        }
    }

    public static class SortBasedOnLength{
        public static void main(String[] args) {
            List<String> fruits = List.of("harsh","apple","banana","grape","watermelon","kiwi");
            System.out.println(fruits.stream().sorted(Comparator.comparingInt(String::length)).toList());
        }
    }

    public static class FindAverageOfNumbers{
        public static void main(String[] args) {
            List<Integer> numbers = List.of(10,5,25,15,30);
            System.out.println(numbers.stream().mapToInt((a)-> a).average().orElseThrow(RuntimeException::new));
        }
    }

    public static class RemoveDuplicates{
        public static void main(String[] args) {
            List<String> fruits = List.of("harsh","apple","apple","banana","banana","grape","watermelon","kiwi");
            System.out.println(fruits.stream().distinct().collect(Collectors.toList()));

        }
    }

    public static class AllSatisfyCondition{
        public static void main(String[] args) {
            List<Integer> numbers = List.of(10,2,4,8);
            System.out.println(numbers.stream().allMatch((a)->a % 2 == 0));

        }
    }

    public static class ContainsElement{
        public static void main(String[] args) {
            List<Integer> numbers = List.of(10,2,4,8);
            System.out.println(numbers.stream().filter((a)->a == 2).findFirst().orElseThrow(RuntimeException::new));
        }
    }

    public static class IfContains{
        public static void main(String[] args) {
            List<Integer> numbers = List.of(10,2,4,8);
            System.out.println(numbers.stream().anyMatch((a) -> a.equals(2)));
        }
    }

    public static class LongestStringLength{
        public static void main(String[] args) {
            List<String> fruits = List.of("harsh","apple","apple","banana","banana","grape","watermelon","kiwi");
            System.out.println(fruits.stream().map(String::length).mapToInt(Integer::intValue).max().getAsInt());
        }
    }

    public static class LongestLengthString{
        public static void main(String[] args) {
            List<String> fruits = List.of("harsh","apple","apple","banana","banana","grape","watermelon","kiwi");
            System.out.println(fruits.stream().sorted((a,b)->Integer.compare(b.length(),a.length())).toList().get(0));
        }
    }

    public static class RemoveNulls{
        public static void main(String[] args) {
            List<String> fruits = Arrays.asList("harsh", "apple", "apple", "banana", "banana", "grape", "watermelon", "kiwi", null);
            System.out.println(fruits.stream().filter(Objects::nonNull).collect(Collectors.toList()));
        }
    }

    public static class GroupByDepartment{
        public static void main(String[] args) {
            List<Employee> employees = new ArrayList<>();
            employees.add(new Employee("Bob", "IT", 600210.0));
            employees.add(new Employee("Bob", "IT", 32.21));
            employees.add(new Employee("Bob", "HR", 331.21));
            employees.add(new Employee("Bob", "IT", 600.0));
            employees.add(new Employee("Bob", "HR", 60320.0));
            Map<String, List<Employee>> out = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
            System.out.println(out);
            //Sum salary of employees based on the department
            List<Map.Entry<Double, List<Employee>>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getSalary)).entrySet().stream()
                    .sorted((a,b)->Double.compare(b.getKey(),a.getKey()))
                    .skip(1)
                    .limit(1)
                    .collect(Collectors.toList());
            System.out.println(collect);
        }
    }

    public static class GroupByAndGetMaximum{
        public static void main(String[] args) {
            List<Employee> employees = new ArrayList<>();
            employees.add(new Employee("Bob", "IT", 600210.0));
            employees.add(new Employee("Bob", "IT", 32.21));
            employees.add(new Employee("Bob", "HR", 331.21));
            employees.add(new Employee("Bob", "IT", 600.0));
            employees.add(new Employee("Bob", "HR", 60320.0));
            Map<String, Optional<Employee>> out = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
            //System.out.println(out);

            Map<String, List<Employee>> collect = employees.stream().collect((Collectors.groupingBy(Employee::getDepartment)));
            collect.entrySet().stream().forEach((a)->{
                System.out.println(a.getKey());
                System.out.println(a.getValue().stream().max(Comparator.comparingDouble(Employee::getSalary)).orElseThrow(RuntimeException::new));
            });
        }
    }

    public static class secondSmallest{
        public static void main(String[] args) {
            List<Integer> list = List.of(4,23,1,32,12,3,3,4);
            System.out.println(list.stream().distinct().sorted().skip(1).findFirst().orElse(null));
        }
    }

    public static class Intersection{
        public static void main(String[] args) {
            List<Integer> list1 = List.of(1,2,3,4,5,6);
            List<Integer> list2 = List.of(5,4,2,1);
            System.out.println(list2.stream().filter(list1::contains).collect(Collectors.toList()));
        }
    }

    public static class GetDuplicates{
        public static void main(String[] args) {
            List<Integer> list = List.of(5,5,1,2,3,3,4);
            System.out.println(list.stream().filter((a)->Collections.frequency(list,a) > 1).distinct().collect(Collectors.toList()));
            System.out.println( list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream()
                    .filter((a)->a.getValue() >= 2)
                            .map(Map.Entry::getKey)
                    .toList());
            Set<Integer> set = new HashSet<>();
            System.out.println(list.stream().filter((a)->!set.add(a)).collect(Collectors.toList()));
        }
    }
}
