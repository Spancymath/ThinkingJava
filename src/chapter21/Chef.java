package chapter21;

import utils.P;

import java.util.concurrent.TimeUnit;

public class Chef implements Runnable {
    private Restaurant restaurant;
    private int count = 0;

    public Chef(Restaurant r) {
        restaurant = r;
    }

    public void run() {
        try {
            while (!Thread.interrupted()) {
                synchronized (this) {
                    while (restaurant.meal != null) {
                        wait();
                    }
                }
                if (++count == 10) {
                    P.println("Out of food, closing");
                    restaurant.exec.shutdownNow();
                }
                TimeUnit.MILLISECONDS.sleep(100);
                P.println("Order up!");
                synchronized (restaurant.waitPerson) {
                    restaurant.meal = new Meal(count);
                    restaurant.waitPerson.notifyAll();
                }
            }
        } catch (InterruptedException e) {
            P.println("Chef interrupted");
        }
    }
}
