package chapter07;

import utils.P;

public class Orc extends Villain {

    private int orcNumber;

    public Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }

    public void change(String name, int orcNumber) {
        this.set(name);
        this.orcNumber = orcNumber;
        //P.println(super.toString());
    }

    public String toString() {
        return "Orc " + orcNumber + ": " + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Limburger", 12);
        P.println(orc);
        orc.change("Bob", 19);
        P.println(orc);
        say(orc);

    }

    public void sayOrc() {
        P.println("Orc say");
    }

    public void say1() {
        P.println("new.");
    }
}
