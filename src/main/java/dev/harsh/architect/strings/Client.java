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
    }
}
