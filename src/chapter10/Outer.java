package chapter10;

import utils.P;

public class Outer {

    public class Inner {

        private int i = 2;

        { for (int j = 0; j < 5; j++) {}}

    }

    public static void main(String[] args) {
        Outer outer = new Outer();

        Outer.Inner inner = outer.new Inner();
        P.println(inner.i);
    }
}
