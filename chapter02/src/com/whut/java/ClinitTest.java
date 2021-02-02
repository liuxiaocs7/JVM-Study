package com.whut.java;

public class ClinitTest {

    // 任何一个类声明以后，内部至少存在一个类的构造器，对应过来就是init方法
    private int a = 1;
    private static int c = 3;

    public ClinitTest() {
        a = 10;
        int d = 20;
    }

    public static void main(String[] args) {
        int b = 2;
    }
}
