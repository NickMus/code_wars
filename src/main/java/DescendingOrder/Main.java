package DescendingOrder;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 27.09.2022
 */
/*
Your task is to make a function that can take any non-negative integer as an argument
and return it with its digits in descending order. Essentially, rearrange the digits
to create the highest possible number.

Examples:
Input: 42145 Output: 54421
 */
public class Main {
    public static int sortDesc(final int num) {
        //Your code
        List<Integer> list = new ArrayList<>();
        Collections.sort(list);
        StringBuilder sb = new StringBuilder(String.valueOf(list));
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }

    @Test
    public void test_01() {
        assertEquals(0, sortDesc(0));
    }

    @Test
    public void test_02() {
        assertEquals(51, sortDesc(15));
    }


    @Test
    public void test_03() {
        assertEquals(987654321, sortDesc(123496785));
    }
}
