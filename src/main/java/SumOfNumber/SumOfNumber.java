package SumOfNumber;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 21.09.2022
 */
public class SumOfNumber {
    public int GetSum(int a, int b) {
        int sum = 0;
        for (int i = Math.min(a,b); i <= Math.max(a,b); i++) {
            sum += i;
        }
        return sum;
    }

    @Test
    public void Test1() {
        assertEquals(-1, GetSum(0, -1));
        assertEquals(1, GetSum(0, 1));
        assertEquals(11, GetSum(6, 5));
        assertEquals(-6, GetSum(-6, 5));
    }

}
