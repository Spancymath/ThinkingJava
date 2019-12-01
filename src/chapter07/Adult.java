package chapter07;

import utils.P;

public class Adult extends Person {

    @Override
    public void pull() {
        P.println("Adult pull.");
    }

    public void hit() {
        P.println("Adult hit.");
    }

    public static void main(String[] args) {
        Person person = new Adult();
        //person.hit();
    }
}
