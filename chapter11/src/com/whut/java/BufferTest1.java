package com.whut.java;

public class BufferTest1 {
    private static final String TO = "E:\\test\\haha.mp4";
    private static final int _100Mb = 1024 * 1024 * 100;

    public static void main(String[] args) {
        long sum = 0;
        String src = "E:\\test\\haha.mp4";
        for(int i = 0; i < 3; i++) {
            String dest = "E:\\test\\haha_" + i + ".mp4";
//            sum += io(src, dest);
//            sum += directBuffer(src, dest);
        }
        System.out.println("总花费的时间为：" + sum);
    }
}
