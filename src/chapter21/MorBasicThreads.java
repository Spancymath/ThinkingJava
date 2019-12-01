package chapter21;

import utils.P;

public class MorBasicThreads {


    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new LiftOff()).start();
        }
        P.println("Waiting for LiftOff");
    }
}
