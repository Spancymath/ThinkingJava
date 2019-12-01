package chapter19;

import utils.P;

public enum OzWitch {
    WEST("Miss Gulch, aka the Wicked Witch of the west"),
    NOERH("Glinda, the Good Witch of the North"),
    EAST("Wiched Witch of the East, wearer of the Ruby " +
            "Slippers, cru shed by Dorothy's housse"),
    SOUTH("Good by interface, but missing");

    private String description;

    private OzWitch(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        for (OzWitch o : OzWitch.values()) {
            P.println(o + ": " + o.getDescription());
        }
    }
}
