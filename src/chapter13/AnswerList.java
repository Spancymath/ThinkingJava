package chapter13;

import utils.P;

import java.io.File;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 字符串
 */
public class AnswerList {

    void test07() {
        System.out.println("S.".matches("[A-Z].*\\."));
    }

    void test10() {
        //Pattern.compile("\\Breg.")
        String[] regs = {"^Java", "\\Breg.*", "n.w\\s+h(a|i)s", "s?", "s*", "s+", "s{4}", "s{1}", "s{0,3}"};
        String words = "Java now has regular expressions";

        for (String reg : regs) {
            Pattern pattern = Pattern.compile(reg);
            Matcher matcher = pattern.matcher(words);
            while (matcher.find()) {
                P.print(matcher.group() + " at position " + matcher.start() + "-" + matcher.end() + ";  ");
            }
            P.println(matcher.matches());
        }
    }

    void test17() {
        File[] files = new File(".").listFiles();
        for (File file : files) {
            P.println(file);
        }
    }

    void test18() {
        Integer[] a = new Integer[] {new Integer(1), new Integer(2)};
        P.println(Arrays.toString(a));


    }

    public static void main(String[] args) {
        AnswerList al = new AnswerList();
        //al.test07();

        //al.test10();
        //al.test17();

        al.test18();

    }
}
