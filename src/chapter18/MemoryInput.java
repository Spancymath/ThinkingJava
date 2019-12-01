package chapter18;

import utils.P;

import java.io.IOException;
import java.io.StringReader;

public class MemoryInput {

    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(BufferedInputFile.read("./file/number.txt"));
        int c;
        while ((c = in.read()) != -1) {
            P.println((char) c);
        }
    }
}
