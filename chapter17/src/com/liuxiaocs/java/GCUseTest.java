package com.liuxiaocs.java;

import java.util.ArrayList;

/**
 * -XX:+PrintCommandLineFlags
 * -XX:+UseSerialGC: 表明新生代使用Serial GC,同时老年代使用 Serial Old GC
 * -XX:+UseParNewGC: 标明新生代使用ParNew GC
 * -XX:+UseParallelGC: 表明新生代使用Parallel GC
 * -XX:+UseParallelOldGC: 表明老年代使用Parallel Old GC
 * 说明：二者可以相互激活
 * -XX:+UseConcMarkSweepGC: 表明老年代使用CMS GC。同时，年轻代会触发对ParNew的使用
 * @author liuxiaocs
 * @date 2021/2/22 20:57
 */
public class GCUseTest {
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<>();
        while(true) {
            byte[] arr = new byte[100];
            list.add(arr);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
