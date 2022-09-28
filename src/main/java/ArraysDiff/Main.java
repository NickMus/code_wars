package ArraysDiff;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 23.09.2022
 */
/*
Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
It should remove all values from list , which are present in list keeping their order.ab
Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2}, new int[]{1})));
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        if (a.length == 0 || b.length == 0) {
            return a;
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }

//        Arrays.stream(a).collect(Collectors.toList());

        for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    if (b[j] == a[i]) {
                            list.remove(j);

                    }
                }
            }
            int[] arr = new int[list.size()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = list.get(i);
            }
            return arr;
        }

        @Test
        public void sampleTests () {
            assertArrayEquals(new int[]{2}, arrayDiff(new int[]{1, 2}, new int[]{1}));
            assertArrayEquals(new int[]{2, 2}, arrayDiff(new int[]{1, 2, 2}, new int[]{1}));
            assertArrayEquals(new int[]{1}, arrayDiff(new int[]{1, 2, 2}, new int[]{2}));
            assertArrayEquals(new int[]{1, 2, 2}, arrayDiff(new int[]{1, 2, 2}, new int[]{}));
            assertArrayEquals(new int[]{}, arrayDiff(new int[]{}, new int[]{1, 2}));
        }
    }
