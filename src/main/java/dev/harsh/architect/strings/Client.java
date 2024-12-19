package dev.harsh.architect.strings;

public class Client {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s4 = new String("abc");
        String s2 = "abc";
        String s3 = "abc";
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1 == s4);


//        Use String when you need immutable sequences of characters
//        Use StringBuilder for mutable sequences of characters in a single-threaded context
//        Use StringBuffer for mutable sequences of characters in a multithreaded context.

        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello");
        StringBuffer buffer2 = new StringBuffer();
        buffer2.append("Hello");
        System.out.println(buffer == buffer2);
        System.out.println(buffer.compareTo(buffer2) == 0);

        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        StringBuilder builder2 = new StringBuilder();
        builder2.append("Hello");
        System.out.println(builder == builder2);
        System.out.println(builder.compareTo(builder2) == 0);
    }
}
