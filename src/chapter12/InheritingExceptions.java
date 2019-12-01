package chapter12;

import utils.P;

public class InheritingExceptions {

    public void f() throws SimpleException {
        P.println("Throw SimpleException from f().");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions sed = new InheritingExceptions();
        try {
            sed.f();
        } catch (SimpleException e) {
            P.println("Caught it.");
        }
    }
}
