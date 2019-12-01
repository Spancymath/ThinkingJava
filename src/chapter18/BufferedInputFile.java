package chapter18;

import utils.P;

import java.io.*;
import java.io.IOException;

public class BufferedInputFile {

    public static String read(String fileName) throws IOException {
        BufferedReader in = null;
        in = new BufferedReader(new FileReader(fileName));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null) {
            sb.append(s + "\n");
        }
        in.close();
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        P.println(read("./file/number.txt"));
    }
}
