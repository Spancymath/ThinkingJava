package chapter07;

import utils.P;

public class Villain {

    private String name;

    protected void set(String nm) {name = nm;}

    public Villain(String name) {
        this.name = name;
    }

    public String toString() {
        return "I'm a Villain and my name is " + name;
    }

    public static void say(Villain villain) {
        P.println("Villain say.");
        villain.sayOrc();
    }

    public void sayOrc() {
        P.println("say Orc in Viliain.");
    }

}
