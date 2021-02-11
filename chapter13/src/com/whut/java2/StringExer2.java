package com.whut.java2;

public class StringExer2 {
    public static void main(String[] args) {
        String s1 = new String("a") + new String("b");

        s1.intern();
        String s2 = "ab";
        System.out.println(s1 == s2); // true
    }
}
