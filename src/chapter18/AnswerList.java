package chapter18;

import utils.P;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Java I/O系统
 */
public class AnswerList {

    void test07() throws IOException {
        Reader reader = new FileReader("./file/number.txt");
        BufferedReader in = new BufferedReader(reader);
        String s;
        LinkedList<String> ll = new LinkedList<>();
        while ((s = in.readLine()) != null) {
            ll.push(s);
        }
        in.close();
        while (!ll.isEmpty()) {
            P.println(ll.pop().toUpperCase());
        }
    }

    public static void main(String[] args) throws Exception {
        AnswerList al = new AnswerList();
        al.test07();
    }
}
