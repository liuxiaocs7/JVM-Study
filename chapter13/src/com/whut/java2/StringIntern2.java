package com.whut.java2;

/**
 * 如何保证变量s指向的是字符串常量池中的数据呢？
 * 有两种方式：
 * 方式一： String s="shkstart";//字面量定义的方式
 * 方式二： 调用intern()
 * String s=new String("shkstart").intern();
 * String s=new StringBuilder("shkstart").toString().intern();
 */

public class StringIntern2 {
    public static void main(String[] args) {

        String s = new String("1");
        s.intern(); // 调用此方法之前，字符串常量池中已经存在了"1"，这一行不起作用
        String s2 = "1";
        // s 是堆空间中new出来的地址，s2是字符串常量池中的地址
        System.out.println(s == s2); //jdk6：false   jdk7/8：false

        /*
         1、s3变量记录的地址为：new String("11")
         2、经过上面的分析，我们已经知道执行完pos_1的代码，在堆中有了一个new String("11")
         这样的String对象。但是在字符串常量池中没有"11"
         3、接着执行s3.intern()，在字符串常量池中生成"11"
           3-1、在JDK6的版本中，字符串常量池还在永久代，所以直接在永久代生成"11",也就有了新的地址
           3-2、而在JDK7的后续版本中，字符串常量池被移动到了堆中，此时堆里已经有new String（"11"）了
           出于节省空间的目的，直接将堆中的那个字符串的引用地址储存在字符串常量池中。没错，字符串常量池
           中存的是new String（"11"）在堆中的地址
         4、所以在JDK7后续版本中，s3和s4指向的完全是同一个地址。
         */
        String s3 = new String("1") + new String("1");//s3变量记录的地址为：new String("11")，堆上的地址
        // 执行完上一行代码以后，字符串常量池中，是否存在11呢?答案：不存在!!!
        s3.intern();  // 执行完这一行代码才将s3放入常量池 "11"，如何理解：jdk6:创建了一个新的对象"11"，也就有新的地址，
        // >= jdk7 中 执行完intern()方法之后导致常量池中记录的就是实际对象(s3)的地址，常量池中记录了堆空间中new的地址
        // 此时常量池中并没有创建"11",而是创建一个指向堆空间中new String("11")的地址

        String s4 = "11"; //s4变量记录的地址：使用的是上一行代码代码执行时，在常量池中生成的"11"的地址
        System.out.println(s3 == s4); //jdk6：false  jdk7/8：true
    }
}
