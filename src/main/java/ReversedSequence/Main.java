package ReversedSequence;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 27.09.2022
 */
/*
Build a function that returns an array of integers from n to 1 where n>0.

Example : n=5 --> [5,4,3,2,1]
 */
public class Main {
    public static int[] reverse(int n) {
        //your code
        int[] arr = new int[n];
        int val = n;
        for (int i = 0; i <= n-1; i++) {
            arr[i] = val;
            val--;
        }
        return arr;
    }

    @Test
    public void simpleTest() {
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, reverse(5));
    }
}
