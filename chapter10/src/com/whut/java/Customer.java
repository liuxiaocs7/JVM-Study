package com.whut.java;

/**
 * 测试对象实例化的过程
 *
 * ① 加载类元信息
 * ② 为对象分配内存【指针碰撞，空闲列表】
 * ③ 处理并发问题【CAS】
 * ④ 属性的默认初始化（零值初始化）
 * ⑤ 设置对象头的信息
 * ⑥ 属性的显式初始化、代码块中初始化、构造器中初始化
 *
 * 给对象的属性赋值的操作：
 * ① 属性的默认初始化
 * ② 显式初始化
 * ③ 代码块中初始化
 * ④ 构造器中初始化
 */
public class Customer {
    // 显式赋值
    int id = 1001;
    String name;
    Account acct;

    {
        // 代码块赋值
        name = "匿名用户";
    }

    public Customer() {
        // 构造器赋值
        acct = new Account();
    }
}

class Account {

}
