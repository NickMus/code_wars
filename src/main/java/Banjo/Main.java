package Banjo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 27.09.2022
 */
/*
Create a function which answers the question "Are you playing banjo?".
If your name starts with the letter "R" or lower case "r", you are playing banjo!

The function takes a name as its only argument, and returns one of the following strings:

name + " plays banjo"
name + " does not play banjo"
 */
public class Main {
    public static String areYouPlayingBanjo(String name) {
        if (name.charAt(0) == 'r' || name.charAt(0) == 'R') {
            return name + " plays banjo";
        } else {
            return name + " does not play banjo";
        }
    }

    @Test
    public void PeopleThatPlayBanjo() {
        assertEquals("Nope!", "Martin does not play banjo", areYouPlayingBanjo("Martin"));
        assertEquals("Nope!", "Rikke plays banjo", areYouPlayingBanjo("Rikke"));
        assertEquals("Nope! Remember lower case counts, too!", "rolf plays banjo", areYouPlayingBanjo("rolf"));
        assertEquals("Nope!", "bravo does not play banjo", areYouPlayingBanjo("bravo"));
    }
}
