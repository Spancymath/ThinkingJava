package chapter09;

import utils.P;

public class Apply {

    public static void process(Processor p, Object s) {
        P.println("Using Processor " + p.name());
        P.println(p.prcess(s));
    }

    public static String s = "Exchange near word.";

}
