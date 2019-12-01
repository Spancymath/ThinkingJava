package chapter18;

import utils.P;

import java.io.*;

public class TestEOF {

    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream(
                new FileInputStream("./src/chapter18/TestEOF.java")
        ));
        while (in.available() != 0) {
            P.println((char) in.readByte());
        }
    }
}
