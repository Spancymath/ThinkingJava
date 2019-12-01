package chapter07;

import utils.P;

public class Square extends Shape {

    @Override
    public void draw() {
        P.println("Square draw.");
    }

    @Override
    public void erase() {
        P.println("Square erase.");
    }
}
