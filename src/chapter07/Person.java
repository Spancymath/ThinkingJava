package chapter07;

import utils.P;

public class Person {

    private void hit() {
        P.println("Person hit.");
        pull();
    }

    public void pull() {
        P.println("Person pull.");
    }

    public static void main(String[] args) {
        Person person = new Adult();
        person.hit();
    }
}
