package chapter09.interfacesimple;

import chapter09.abstractclass.Note;

public interface Instrument {

    int VALUE = 5;

    void play(Note note);

    void adjust();
}
