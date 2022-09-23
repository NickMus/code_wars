package Isogram;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 22.09.2022
 */

/*
An isogram is a word that has no repeating letters, consecutive or non-consecutive.
Implement a function that determines whether a string that contains only letters is an isogram.
Assume the empty string is an isogram. Ignore letter case.
 */
public class Main {
    public static boolean isIsogram(String str) {
        char[] chars = str.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    return false;
                }
            }
        }
//        return true;
        return str.length() == str.toLowerCase().chars().distinct().count();
    }

    @Test
    public void FixedTests() {
        assertEquals(true, isIsogram("Dermatoglyphics"));
        assertEquals(true, isIsogram("isogram"));
        assertEquals(false, isIsogram("moose"));
        assertEquals(false, isIsogram("isIsogram"));
        assertEquals(false, isIsogram("aba"));
        assertEquals(false, isIsogram("moOse"));
        assertEquals(true, isIsogram("thumbscrewjapingly"));
        assertEquals(true, isIsogram(""));
    }
}
