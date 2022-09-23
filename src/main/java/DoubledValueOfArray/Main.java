package DoubledValueOfArray;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 23.09.2022
 */
public class Main {
    public static int[] map(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = arr[i]*=2;
//        }
        return Arrays.stream(arr).map(s->s*2).toArray();
    }

    @Test
    public void sampleTests() {
        assertArrayEquals(new int[]{2, 4, 6}, map(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{8, 2, 2, 2, 8}, map(new int[]{4, 1, 1, 1, 4}));
        assertArrayEquals(new int[]{2, 2, 2, 2, 2, 2}, map(new int[]{1, 1, 1, 1, 1, 1}));
    }
}
