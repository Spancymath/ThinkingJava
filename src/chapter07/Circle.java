package chapter07;

import utils.P;

public class Circle extends Shape {

    @Override
    public void draw() {
        P.println("Circle draw.");
    }

    @Override
    public void erase() {
        P.println("Circle erase.");
    }

    @Override
    public void say() {
        P.println("Circle is here.");
    }
}
