package com.whut.java;

/**
 * -Xms20m -Xmx20m
 * 初始堆空间和最大堆空间都是20M
 */
public class HeapDemo1 {
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
