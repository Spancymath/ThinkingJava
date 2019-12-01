package chapter17;

import utils.P;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FillingLists {

    public static void main(String[] args) {
        List<StringAddress> list = new ArrayList<>(Collections.nCopies(4, new StringAddress("Hello")));
        P.println(list);
        Collections.fill(list, new StringAddress("word!"));
        P.println(list);
    }
}

class StringAddress {
    private String s;

    public StringAddress(String s) {
        this.s = s;
    }

    public String toString() {
        return super.toString() + "s";
    }
}
