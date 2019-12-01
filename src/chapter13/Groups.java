package chapter13;

import utils.P;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups {
    static public String POEM =
            "Twas brilling, and the slithy toves\n"
            + "Did gyre and the wabe.\n"
            + "All mimsy were the borogobes,\n"
            + "And the mome raths outgrabe.\n\n"
            + "Beware the Jabberwock, my son,\n"
            + "The jaws that bite, the claws that catch.\n"
            + "Beware the Jubjub bird , and shun\n"
            + "The frumious Bandersnatch.";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(^|\\s)([a-z]+)");
        Matcher matcher = pattern.matcher(POEM);

        //P.println(matcher.groupCount());
        Set<String> wordCount = new HashSet<>();

        while (matcher.find()) {
            wordCount.add(matcher.group(2));
            P.println(matcher.group(2));
        }

        P.println(wordCount.size());
    }
}
