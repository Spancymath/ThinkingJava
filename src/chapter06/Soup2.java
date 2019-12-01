package chapter06;

/**
 * 单例模式
 */
public class Soup2 {

    private Soup2() {}

    private static Soup2 sp = new Soup2();

    public static Soup2 access() {
        return sp;
    }

    public void f() {};
}
