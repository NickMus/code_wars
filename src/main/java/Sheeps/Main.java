package Sheeps;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 22.09.2022
 */

/*
Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...".
Input will always be valid, i.e. no negative integers.
 */
public class Main {
    public static String countingSheep(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            sb.append(i).append(" sheep...");
        }
        return sb.toString();

    }

    @Test
    public void testSomething() {
        assertEquals("", countingSheep(0));
        assertEquals("1 sheep...", countingSheep(1));
        assertEquals("1 sheep...2 sheep...", countingSheep(2));
        assertEquals("1 sheep...2 sheep...3 sheep...", countingSheep(3));
    }
}
