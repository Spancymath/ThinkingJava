package chapter21;

import utils.P;

public class BasicThreads {

    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        P.println("Waiting for LiftOff");
    }
}
