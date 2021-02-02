package java.lang;

public class String {
    static{
        System.out.println("我是自定义的String类的静态代码块");
    }

    // 核心API中的String是没有main方法的
    // 错误: 在类 java.lang.String 中找不到 main 方法
    public static void main(String[] args) {
        System.out.println("Hello, String");
    }
}
