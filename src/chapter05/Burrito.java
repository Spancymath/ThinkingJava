package chapter05;

import utils.P;

/**
 * 枚举类型
 */
public class Burrito {
    private Spiciness degree;

    public Burrito(Spiciness degree) {
        this.degree = degree;
    }

    public void describe() {
        P.print("This burrito is ");
        switch (degree) {
            case NOT: P.println("not spicy at all.");
                      break;
            case MILD:
            case MEDIUM: P.println("a little hot.");
                         break;
            case HOT:
            case FLAMING:
            default: P.println("may be too hot.");
        }
    }

    public static void main(String[] args) {
        Burrito plain = new Burrito(Spiciness.NOT),
                greenChile = new Burrito(Spiciness.MEDIUM),
                jalapeno = new Burrito(Spiciness.HOT);
        plain.describe();
        greenChile.describe();
        jalapeno.describe();
    }
}

enum Spiciness {
    NOT, MILD, MEDIUM, HOT, FLAMING
}
