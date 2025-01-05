package dev.prakhar.architect.streams;

import java.util.List;
import java.util.stream.Collectors;

public class SumOfEven {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(numbers.stream().filter((a)->((a & 1)) == 0).mapToInt(Integer::intValue).sum());
        //So operations like sum,avg,max,min like sql can be performed on map to int conversion as it converts stream to intstream
    }
}
