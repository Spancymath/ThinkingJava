package chapter10;

import utils.P;

public class Implementation2 implements Service {

    private Implementation2() {}

    @Override
    public void method1() {
        P.println("Implementation2 method1.");
    }

    @Override
    public void method2() {
        P.println("Implementation2 method2.");
    }

    public static ServiceFactory factory =
            new ServiceFactory() {
                @Override
                public Service getService() {
                    return new Implementation2();
                }
            };
}
