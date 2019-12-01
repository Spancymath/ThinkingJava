package chapter14;

import utils.P;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ToyTest {


    static void printInfo(Class cc) {
        P.println("Class name: " + cc.getName() + " is interface: ["
            + cc.isInterface() + "]");
        P.println("Simple name: " + cc.getSimpleName());
        P.println("Canonical name: " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("chapter14.FancyToy");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
        printInfo(c);

        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }

        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}

interface HasBatteries {}

interface Waterproof {}

interface Shoots {}

class Toy {

    Toy () {}

    Toy (int i) {
        try {
            Class<?> c = Class.forName("Toy");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Constructor[] constructors = getClass().getConstructors();
        try {
            constructors[0].newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
    FancyToy() {
        super(1);
    }
}
