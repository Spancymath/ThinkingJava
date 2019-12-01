package chapter21;

import utils.P;

public class HelloThread implements Runnable {

    public HelloThread() {
        P.println("start");
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            P.println("hello");
            Thread.yield();
        }
        P.println("end");
    }
}
