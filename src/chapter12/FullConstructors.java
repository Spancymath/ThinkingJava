package chapter12;

import utils.P;

public class FullConstructors {

    public static void f() throws MyException {
        P.println("Throwing MyException from f()");
        throw new MyException();
    }

    public static void g() throws MyException {
        P.println("Throwing MyException from g()");
        throw new MyException("Originated in g()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }

        try {
            g();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
