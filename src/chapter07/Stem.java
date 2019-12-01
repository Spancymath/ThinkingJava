package chapter07;

import utils.P;

public class Stem extends Root {

    Component1 component1 = new Component1();

    public Stem() {
        P.println("Stem");
    }

    Component2 component2 = new Component2();

    Component3 component3 = new Component3();

    public static void main(String[] args) {
        Stem stem = new Stem();
    }
}
