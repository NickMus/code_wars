package Summation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 28.09.2022
 */
public class Main {
    public static int summation(int n) {
        int sum = 0;
        for (int i = 0; i < n + 1; i++) {
            sum+=i;
        }
        return sum;
    }

    @Test
    public void test1() {
        assertEquals(1, summation(1));
    }

    @Test
    public void test2() {
        assertEquals(36, summation(8));
    }
}
