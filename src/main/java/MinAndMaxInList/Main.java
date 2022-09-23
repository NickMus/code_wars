package MinAndMaxInList;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 22.09.2022
 */
public class Main {
    public static int[] minMax(int[] arr) {
        int min;
        int max;
        min = Arrays.stream(arr).min().getAsInt();
        max = Arrays.stream(arr).max().getAsInt();
       int[] arrr= {min,max};
    return arrr;
    }


    Random rand;

    @Before
    public void initTest() {
        rand = new Random();
    }

    @Test
    public void testExampleCases() {
        assertArrayEquals(new int[]{1, 5}, minMax(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{5, 2334454}, minMax(new int[]{2334454, 5}));
        assertArrayEquals(new int[]{1, 1}, minMax(new int[]{1}));
    }

    @Test
    public void minMaxRandomTest() {
        for (int i = 0; i < 20; i++) {
            int r = rand.nextInt();
            assertArrayEquals(new int[]{r, r}, minMax(new int[]{r}));
        }
    }
}
