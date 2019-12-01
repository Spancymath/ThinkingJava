package chapter17;

import utils.P;

import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionDataTest {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>(new CollectionData<>(new Government(), 5));
        P.println(set);
        set.addAll(CollectionData.list(new Government(), 15));
        P.println(set);
    }
}

class Government implements Generator<String> {
    private String[] foundation = ("strange women lying in ponds " +
            "distributing swords is no basis for a system of " +
            "government").split(" ");
    private int index;

    public String next() {
        return foundation[index++];
    }
}
