package chapter21;

import utils.P;

public class LiftOff implements Runnable {
    protected  int counDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOff() {}

    public LiftOff(int counDown) {
        this.counDown = counDown;
    }

    public String status() {
        return "#" + id + "(" +
                (counDown > 0 ? counDown : "LiftOff!") + "). ";
    }

    @Override
    public void run() {
       while ((counDown-- > 0)) {
           P.println(status());
           //Thread.yield();
       }
    }
}
