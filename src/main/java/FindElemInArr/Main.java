package FindElemInArr;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 21.09.2022
 */

/*
You will be given an array and a value . All you need to do is check whether the provided array contains the value.ax
Array can contain numbers or strings. X can be either.
Return if the array contains the value, if not. truefalse
 */
public class Main {
    public static void main(String[] args) {

    }

    public static boolean check(Object[] a, Object x) {
        // Your code here
        return Arrays.asList(a).contains(x);
    }

    @Test
    public void testSomething() {
        assertEquals(Main.check(new Object[] {66, 101}, 66), true);
        assertEquals(Main.check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45), true);
        assertEquals(Main.check(new Object[] {'t', 'e', 's', 't'}, 'e'), true);
        assertEquals(Main.check(new Object[] {"what", "a", "great", "kata"}, "kat"), false);
    }
}
