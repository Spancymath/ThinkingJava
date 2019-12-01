package chapter09.interfacesimple;

import chapter09.abstractclass.Note;
import utils.P;

public class Wind implements Instrument {
    @Override
    public void play(Note note) {
        P.println(this + ".play() " + note);
    }

    @Override
    public String toString() {
        return "Wind";
    }

    @Override
    public void adjust() {
        P.println(this + ".adjust()");
    }
}
