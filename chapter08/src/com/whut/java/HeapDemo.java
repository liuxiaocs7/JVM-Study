package com.whut.java;

/**
 * -Xms10m -Xmx10m
 * 初始堆空间和最大堆空间都是10M
 */
public class HeapDemo {
    public static void main(String[] args) {
        System.out.println("start...");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end...");
    }
}
