package chapter09.abstractclass;

import utils.P;

public class Stringed extends Instrument {
    @Override
    public void play(Note note) {
        P.println("Stringed.play()" + note);
    }

    public String what() {
        return "Stringed";
    }

    @Override
    public void adjust() {

    }

    @Override
    public void print() {

    }
}
