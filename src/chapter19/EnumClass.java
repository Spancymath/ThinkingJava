package chapter19;

import utils.P;

public class EnumClass {
    public static void main(String[] args) {
        for (Shrubbery s : Shrubbery.values()) {
            P.println(s + " ordinal: " + s.ordinal());
            P.print(s.compareTo(Shrubbery.CRAWLING) + " ");
            P.print(s.equals(Shrubbery.CRAWLING) + " ");
            P.println(s == Shrubbery.CRAWLING);
            P.println(s.getDeclaringClass());
            P.println(s.name());
            P.println("-------------------------------");
        }

        for (String s : "HANGING CRAWLING GROUND".split(" ")) {
            Shrubbery shrub = Enum.valueOf(Shrubbery.class, s);
            P.println(shrub);
        }
    }
}

enum Shrubbery {
    GROUND, CRAWLING, HANGING
}
