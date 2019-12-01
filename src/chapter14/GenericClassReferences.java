package chapter14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericClassReferences {

    public static void main(String[] args) {
        Class<Number> genericNumberClass = Number.class;

        List<? super Apple> list = new ArrayList<Fruit>();//Arrays.asList(new Jonathan());//new ArrayList<Jonathan>();
        list.add(new Apple());
        //list.add(new Fruit());
        //list.add(new Orange());
        list.add(new Jonathan());
    }

}


class Fruit {};

class Apple extends Fruit {};

class Orange extends Fruit {};

class Jonathan extends Apple {};
