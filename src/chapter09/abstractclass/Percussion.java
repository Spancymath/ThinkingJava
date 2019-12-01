package chapter09.abstractclass;

import utils.P;

public class Percussion extends Instrument {
    @Override
    public void play(Note note) {
        P.println("Percussion.play() " + note);
    }

    public String what() {
        return "Percussion";
    }

    @Override
    public void adjust() {

    }

    @Override
    public void print() {

    }
}
