package chapter19;

import utils.P;

import static chapter19.Spiciness.*;

public class Burrito {
    Spiciness degree;

    public Burrito(Spiciness degree) {
        this.degree = degree;
    }

    public String toString() {
        return "Burrito is " + degree;
    }

    public static void main(String[] args) {
        P.println(new Burrito(NOT));
        P.println(new Burrito(MILD));
    }
}
