package TwiceAsOld;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 26.09.2022
 */
/*
Your function takes two arguments:
current father's age (years)
current age of his son (years)

Сalculate how many years ago the father was twice as old as his son (or in how many years he will be twice as old).
The answer is always greater or equal to 0, no matter if it was in the past or it is in the future.
 */
public class Main {

    public static int TwiceAsOld(int dadYears, int sonYears) {
        int i = sonYears * 2;
        if (i > dadYears) {
            i -= dadYears;
        } else {
            i = dadYears - i;
        }
        return i;
    }

    @Test
    public void testSomething() {
        assertEquals(30, TwiceAsOld(30, 0));
        assertEquals(16, TwiceAsOld(30, 7));
        assertEquals(15, TwiceAsOld(45, 30));

    }
}


