package com.whut.java2;

/**
 * 如何保证变量s指向的是字符串常量池中的数据呢？
 * 有两种方式
 * 方式一： String s = "hello"; // 字面量定义的方式
 * 方式二： 调用intern()方法
 *          String s = new String("hello").intern();
 *          String s = new StringBuilder("hello").toString().intern();
 */
public class StringIntern {
    public static void main(String[] args) {
        String s = new String("1");
        s.intern();  // 将 "1" 放入常量池
        String s2 = "1";
        String s3 = "1";
        System.out.println(s == s2);  // false
        System.out.println(s2 == s3); // true
    }
}
