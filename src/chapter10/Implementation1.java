package chapter10;

import utils.P;

public class Implementation1 implements Service {

    private Implementation1() {}

    @Override
    public void method1() {
        P.println("Impleentation1 method1.");
    }

    @Override
    public void method2() {
        P.println("Impleentation1 method2.");
    }

    public static ServiceFactory factory =
            new ServiceFactory() {
                @Override
                public Service getService() {
                    return new Implementation1();
                }
            };
}
