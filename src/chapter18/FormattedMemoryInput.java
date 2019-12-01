package chapter18;

import utils.P;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

public class FormattedMemoryInput {

    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new ByteArrayInputStream(
                BufferedInputFile.read("./file/number.txt").getBytes()
        ));
        try {
            while (true) {
                P.println((char) in.readByte());
            }
        } catch (EOFException e) {
            System.err.println("End of Stream.");
        }
    }
}
