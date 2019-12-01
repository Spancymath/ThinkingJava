package chapter05;

import utils.P;

/**
 * 初始化与清理
 * 1.重载方法的区分：每个重载方法都必须有一个独一无二的参数类型列表
 * 2.对未完全匹配的参数，总是会向上转型来匹配（char向上转型到int。。）。对于向上转型匹配不成功的，会报错
 * 3.不能通过返回值类型匹配
 * 4.static方法就是没有this的方法
 * 5.类被清理的时候会调用finalize()方法，可以在这个方法中添加逻辑，判断被清理的时候，功能是否被完成
 * 6.自适应的、分代的、停止-复制、标记-清扫式垃圾回收器
 * 7.对象被创建在堆上
 * 8.可变参数列表：Object... args
 * 9.使用可变参数，往往需要有一个非可变参数
 */
public class AnswerList {

    public void test10() {
        while (true) {
            CleanUp cleanUp = new CleanUp();
            //cleanUp.finalize();
        }
    }

    public static void main(String[] args) {
       AnswerList al = new AnswerList();
       al.test10();
       System.gc();
    }
}

class CleanUp {
    protected void finalize() {
        P.println("clean");
    }
}

