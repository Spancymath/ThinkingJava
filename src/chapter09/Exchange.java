package chapter09;

public class Exchange {

    public String name() {
        return getClass().getSimpleName();
    }

    public String process(String s) {
        char[] array = new char[s.length()];
        int i;
        for (i = 1; i < s.length(); i++) {
            array[i] = s.charAt(i - 1);
            array[i - 1] = s.charAt(i);
        }

        if (i < s.length()) {
            array[i] = s.charAt(i);
        }

        return String.copyValueOf(array);
    }
}
