package chapter10;

import utils.P;

public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
                i++;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    private class SequenceReverseSelector implements ReverseSelector {
        private int i = items.length - 1;

        @Override
        public boolean start() {
            return i == -1;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void last() {
            i--;
        }
    }

    public ReverseSelector reverseSelector() {
        return new SequenceReverseSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }

        Selector selector = sequence.selector();
        while (!selector.end()) {
            P.print(selector.current());
            selector.next();
        }
        P.println("");

        ReverseSelector reverseSelector = sequence.reverseSelector();
        while (!reverseSelector.start()) {
            P.print(reverseSelector.current());
            reverseSelector.last();
        }
        P.println("");
    }
}
