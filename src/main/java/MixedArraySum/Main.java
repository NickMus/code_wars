package MixedArraySum;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 26.09.2022
 */
/*
Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
 */
public class Main {
        public int sum(List<?> mixed) {
            List<Integer> integers = new ArrayList<>();
            int sum = 0;
            for (Object s: mixed) {
                if (s.getClass()==Integer.class) {
                    integers.add((Integer)s);
                } else {
                    integers.add(Integer.parseInt((String) s));
                }
            }
            for(Integer integer:integers) {
                sum += integer;
            }
            System.out.println(mixed);
            mixed.stream().mapToInt(s->Integer.parseInt(s.toString())).sum();
            return sum;
        }
        @Test
        public void test_1() {
            assertEquals(10, sum(Arrays.asList(5,"5")));
        }

        @Test
        public void test_2() {
            assertEquals(22, sum(Arrays.asList(9, 3, "7", "3")));
        }

        @Test
        public void test_3() {
            assertEquals(42, sum(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7)));
        }

        @Test
        public void test_4() {
            assertEquals(41, sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
        }

        @Test
        public void test_5() {
            assertEquals(45, sum(Arrays.asList("1", "5", "8", 8, 9, 9, 2, "3")));
        }

        @Test
        public void test_6() {
            assertEquals(41, sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
        }

        @Test
        public void test_7() {
            assertEquals(61, sum(Arrays.asList(8, 0, 0, 8, 5, 7, 2, 3, 7, 8, 6, 7)));
        }
}
