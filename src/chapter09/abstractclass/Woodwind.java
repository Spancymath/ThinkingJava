package chapter09.abstractclass;

import utils.P;

public class Woodwind extends Wind {

    public void play(Note note) {
        P.println("Woodwind.play() " + note);
    }

    public String what() {
        return "Woodwind";
    }
}
