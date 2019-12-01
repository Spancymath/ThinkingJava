package chapter10;

import utils.P;

public class Apple implements Fruit {

    @Override
    public void kind() {
        P.println("I'm Apple.");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.what();
    }
}
