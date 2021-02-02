package com.whut.java1;

public class ClassLoaderTest2 {
    public static void main(String[] args) {
        try {
            // 方式1
            ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
            System.out.println(classLoader);  // null

            // 方式2
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            System.out.println(contextClassLoader);  // sun.misc.Launcher$AppClassLoader@18b4aac2

            // 方式3
            ClassLoader classLoader1 = ClassLoader.getSystemClassLoader().getParent();
            System.out.println(classLoader1);

            // 方式4
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
