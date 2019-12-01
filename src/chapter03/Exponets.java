package chapter03;

import static utils.P.println;

/**
 * 指数计数法
 */
public class Exponets {

    public static void main(String[] args) {
        float expFloat = 1.39E-43F;
        println(expFloat);
        double expDouble = 1.39E43;
        println(expDouble);

        println("minFloat: " + Float.MIN_VALUE);
        println("maxFloat: " + Float.MAX_VALUE);

        println("minDouble: " + Double.MIN_VALUE);
        println("maxDouble: " + Double.MAX_VALUE);
    }
}
