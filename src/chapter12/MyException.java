package chapter12;

public class MyException extends Exception {

    String info;

    public MyException() {}

    public MyException(String msg) {
        super(msg);
        info = msg;
    }
}
