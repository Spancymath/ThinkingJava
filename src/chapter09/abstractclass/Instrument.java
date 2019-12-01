package chapter09.abstractclass;

abstract class Instrument {

    //private int i;

    public abstract void play(Note note);

    public String what() {
        return "Instrument";
    }

    public abstract void adjust();

    public abstract void print();// {
        //P.println(i);
    //}

}
