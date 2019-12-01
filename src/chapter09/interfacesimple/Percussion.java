package chapter09.interfacesimple;

import chapter09.abstractclass.Note;
import utils.P;

public class Percussion implements Instrument {
    @Override
    public void play(Note note) {
        P.println(this + ".play() " + note);
    }

    public String toString() {
        return "Percussion";
    }

    @Override
    public void adjust() {
        P.println(this + ".adjust()");
    }
}
