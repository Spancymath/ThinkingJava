package chapter19;

import utils.P;

import java.util.EnumSet;

public class EnumSets {

    public static void main(String[] args) {
        EnumSet<AlarmPoints> points = EnumSet.allOf(AlarmPoints.class);
        P.println(points);
    }
}
