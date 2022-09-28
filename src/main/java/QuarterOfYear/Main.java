package QuarterOfYear;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 27.09.2022
 */
/*
Given a month as an integer from 1 to 12, return to which quarter of the year it belongs as an integer number.

For example: month 2 (February), is part of the first quarter; month 6 (June),
is part of the second quarter; and month 11 (November), is part of the fourth quarter.
 */
public class Main {
    public static int quarterOf(int month) {
        // Your code here
        return month < 4 ? 1 : month < 7 ? 2 : month < 10 ? 3 : 4;

    }

    @Test
    public void exampleTests() {
        assertEquals(1, quarterOf(3));
        assertEquals(3, quarterOf(8));
        assertEquals(4,quarterOf( 11));
    }
}
