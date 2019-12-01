package chapter09.abstractclass;

import utils.P;

public class Wind extends Instrument {

    public int i = 9;

    @Override
    public void play(Note note) {
        P.println("wind.play() " + note);
    }

    public String what() {
        return "Wind";
    }

    @Override
    public void adjust() {

    }

    //@Override
    public void print() {
        P.println(i);
    }
}
