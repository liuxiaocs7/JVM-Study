package com.whut.java1;

/**
 * 《深入理解Java虚拟机》中的案例：
 * staticObj、instanceObj、localObj存放在哪里？
 */
public class StaticObjTest {
    static class Test {
        // 静态属性
        static ObjectHolder staticObj = new ObjectHolder();
        // 非静态属性
        ObjectHolder instanceObj = new ObjectHolder();

        void foo() {
            // 方法内的局部变量
            ObjectHolder localObj = new ObjectHolder();
            System.out.println("done");
        }
    }

    private static class ObjectHolder {
    }

    public static void main(String[] args) {
        Test test = new StaticObjTest.Test();
        test.foo();
    }
}
