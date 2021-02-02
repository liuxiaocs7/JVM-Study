package com.whut.java;

public class ClassInitTest {

    private static int num = 1;

    static {
        num = 2;
        number = 20;
        System.out.println(num);

        // 报错：非法的前向引用(Illegal forward reference)
        // 声明的变量在后面，在static静态代码块中无法调用，可以进行赋值
        // System.out.println(number);
    }

    // 1. linking之prepare: number = 0 已经给number赋了初始值0，默认初始化
    // 2. initial中进行覆盖 number = 20 --> 10 (从上到下)
    private static int number = 10;

    public static void main(String[] args) {
        System.out.println(ClassInitTest.num);
        System.out.println(ClassInitTest.number);
    }
}
