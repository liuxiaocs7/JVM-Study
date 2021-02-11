package com.whut.java;

public class SimpleHeap {
    // 属性、成员变量
    private int id;

    public SimpleHeap(int id) {
        this.id = id;
    }

    public void show() {
        System.out.println("My ID is " + id);
    }
    public static void main(String[] args) {
        // 对象
        SimpleHeap sl = new SimpleHeap(1);
        SimpleHeap s2 = new SimpleHeap(2);

        // 数组
        int[] arr = new int[10];

        Object[] arr1 = new Object[10];
    }
}
