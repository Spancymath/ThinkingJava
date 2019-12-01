package chapter14;

import utils.P;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class Shapes {

    static void rotate(Shape shape) {
        if (shape instanceof Circle) {
            return;
        }
        P.println(shape.getClass());
    }

    static void printClassTree(Class<?> o) {
        //基类Object
        if (o == Object.class) {
            P.println("Object");
            return;
        }
        printClassTree(o.getSuperclass());
        //继承的类
        P.print(o.getSimpleName());
        //实现的接口
        if (o.getInterfaces().length > 0) P.print("实现的接口: ");
        for (Class face : o.getInterfaces()) {
            P.print(face.getSimpleName() + " ");
        }
        //P.println();
        //域
        if (o.getDeclaredFields().length > 0) P.print("定义的域：");
        for (Field field : o.getDeclaredFields()) {
            P.print(field.getName() + " ");
        }
        P.println("");
    }

    public static void main(String[] args) {
        /*List<Shape> shapes = Arrays.asList(new Circle(), new Square(), new Triangle());
        for (Shape shape : shapes) {
            //shape.draw();
            //rotate(shape);
            shape.rotate();
        }

        Shape rhomboid = new Rhomboid();
        if (rhomboid instanceof Circle) {
            Circle toCircle = (Circle) rhomboid;
            P.println("toCircle");
        } else if (rhomboid instanceof Rhomboid) {
            Rhomboid toRhomboid = (Rhomboid) rhomboid;
            P.println("toRhomboid");
        }*/

        printClassTree(Rhomboid.class);

        //char[] chars = new char[10];
        //P.println(chars instanceof Object);
    }
}

interface Color {
    void paint();
}

abstract class Shape implements Color {
    static String signClass;

    void draw() {
        P.println(this + ".draw()");
    }

    void rotate() {
        if (this instanceof Circle) {
            return;
        }
        P.println(this.getClass());
    }

    public void paint() {}

    abstract public String toString();
}

class Circle extends Shape {

    public String toString () {
        if (this.getClass().getSimpleName().equals(signClass)) return "has sign.";
        return "Circle";
    }
}

class Square extends Shape {

    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {

    public String toString() {
        return "Triangle";
    }
}

class Rhomboid extends Shape {

    public String toString() {
        return "Rhomboi";
    }
}
