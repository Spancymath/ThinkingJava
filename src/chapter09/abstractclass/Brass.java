package chapter09.abstractclass;

import utils.P;

public class Brass extends Wind {

    public void play(Note note) {
        P.println("Brass.play()" + note);
    }

    public void adjust() {
        P.println("Brass.adjust()");
    }
}
