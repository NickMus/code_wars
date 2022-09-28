package TheFeastofManyBeasts;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 26.09.2022
 */
public class Main {
    public static boolean feast(String beast, String dish) {
        char[] beasts = beast.toCharArray();
        char[] dishes = dish.toCharArray();

        return beasts[0] == dishes[0] && beasts[beasts.length - 1] == dishes[dishes.length - 1];
    }

    @Test
    public void fixedTest() {
        assertTrue(feast("great blue heron", "garlic nann"));
        assertTrue(feast("chickadee", "chocolate cake"));
        assertFalse(feast("brown bear", "bear claw"));
    }
}
