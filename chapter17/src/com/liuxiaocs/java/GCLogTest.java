package com.liuxiaocs.java;

import java.util.ArrayList;

/**
 * -Xms60M -Xmx60M -XX:SurvivorRatio=8 -XX:+UseSerialGC -Xloggc:./logs/gc.log
 */
public class GCLogTest {
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            byte[] arr = new byte[1024 * 100]; // 100kB
            list.add(arr);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
