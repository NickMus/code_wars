package Abbreviate;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
/*
Write a function to convert a name into initials.
This kata strictly takes two words with one space in between them.
The output should be two capital letters with a dot separating them.
It should look like this:
Sam Harris => S.H
patrick feeney => P.F
 */
/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 22.09.2022
 */
public class Main {
    public static String abbrevName(String name) {
       return Stream.of(name.split(" "))
                .map(str -> str.substring(0,1).toUpperCase())
                .collect(Collectors.joining("."));
    }

    @Test
    public void testFixed() {
        assertEquals("S.H", abbrevName("Sam Harris"));
        assertEquals("P.F", abbrevName("Patrick Feenan"));
        assertEquals("E.C", abbrevName("Evan Cole"));
        assertEquals("P.F", abbrevName("P Favuzzi"));
        assertEquals("D.M", abbrevName("David Mendieta"));
    }
}
