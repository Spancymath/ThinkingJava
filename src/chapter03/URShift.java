package chapter03;

import utils.P;

/**
 * 移位操作符
 */
public class URShift {

    public static void main(String[] args) {
        int i = -1;
        P.println(Integer.toBinaryString(i));
        i >>= 10;
        P.println(Integer.toBinaryString(i));;
        i >>>= 10;
        P.println(Integer.toBinaryString(i));

        long l = -1;
        P.println(Long.toBinaryString(l));

        short s = -1;
        P.println(Integer.toBinaryString(s));

        byte b = -1;
        P.println(Integer.toBinaryString(b));
        b >>>= 10;
        P.println(Integer.toBinaryString(b));

        b = -1;
        P.println(Integer.toBinaryString(b));
        P.println(Integer.toBinaryString(b>>>10));

    }
}
