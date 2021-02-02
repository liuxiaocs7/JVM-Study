package com.whut.java1;

import sun.security.ec.CurveDB;

import java.net.URL;
import java.security.Provider;

public class ClassLoaderTest1 {
    public static void main(String[] args) {
        System.out.println("**********启动类加载器**************");
        // 获取BootstrapClassLoader能够加载的api的路径
        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for(URL element : urls) {
            System.out.println(element.toExternalForm());
        }


        // 从上面的路径中随意选择一个类,来看看他的类加载器是什么:引导类加载器(bootstrap)
        ClassLoader classLoader = Provider.class.getClassLoader();
        System.out.println(classLoader);  // null

        System.out.println("***********扩展类加载器*************");
        String extDirs = System.getProperty("java.ext.dirs");
        for(String path: extDirs.split(";")) {
            System.out.println(path);
        }

        // 从上面的路径中随意选择一个类,来看看他的类加载器是什么:扩展类加载器
        ClassLoader classLoader1 = CurveDB.class.getClassLoader();
        System.out.println(classLoader1);  // sun.misc.Launcher$ExtClassLoader@7ea987ac
    }
}
