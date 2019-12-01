package chapter07;

public class Shapes {

    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
        shape.say();
        shape = new Square();
        shape.draw();
        shape.say();
    }
}
