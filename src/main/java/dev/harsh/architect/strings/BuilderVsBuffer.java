package dev.harsh.architect.strings;

import java.util.stream.IntStream;

public class BuilderVsBuffer {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        IntStream.range(0,200).map((a)->1).parallel().forEach(builder::append);
        StringBuffer buffer = new StringBuffer();
        IntStream.range(0,200).map((a)->1).parallel().forEach(buffer::append);
        System.out.println("buffer "+buffer.length());
        System.out.println("builder "+builder.length());
    }
}
