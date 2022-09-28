package ParseCharToInt;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 28.09.2022
 */
/*
You ask a small girl,"How old are you?" She always says, "x years old", where x is a random number between 0 and 9.

Write a program that returns the girl's age (0-9) as an integer.

Assume the test input string is always a valid string. For example, the test input may be "1 year old"
or "5 years old". The first character in the string is always a number.
 */
public class Main {
    public static int howOld(final String herOld) {
        char[] chars = herOld.toCharArray();
        return Character.getNumericValue(chars[0]);


    }

    @Test
    public void test1() {
        assertEquals(5, howOld("5 years old"));
    }

    @Test
    public void test2() {
        assertEquals(9, howOld("9 years old"));
    }

    @Test
    public void test3() {
        assertEquals(1, howOld("1 year old"));
    }
}
