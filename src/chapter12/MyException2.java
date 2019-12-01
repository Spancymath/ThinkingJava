package chapter12;

import java.io.StringWriter;

public class MyException2 extends Exception {
    private int x;

    public MyException2() {}

    public MyException2(String msg) {
        super(msg);
    }

    public MyException2(String msg, int x) {
        super(msg);
        this.x = x;
    }

    public int val() {
        return x;
    }

    @Override
    public String getMessage() {
        return "Detail Message: " + x + " " + super.getMessage();
    }

    public static void main(String[] args) {
        try {
            throw new MyException2("hi", 22);
        } catch (MyException2 e) {
            e.printStackTrace(System.out);
        }
    }
}
