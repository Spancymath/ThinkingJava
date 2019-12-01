package chapter09;

public class ExchangeProcessor {

    public static void main(String[] args) {
        String s = "ExchangeProcessor";
        Apply.process(new ExchangeAdapter(new Exchange()), s);
    }
}
