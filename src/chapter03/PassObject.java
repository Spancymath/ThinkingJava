package chapter03;

/**
 * 方法调用中的别名问题
 */
public class PassObject {
    static void f(Letter y) {
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("x.c: " + x.c);
        f(x);
        System.out.println("x.c: " + x.c);
    }
}

class Letter {
    char c;
}
