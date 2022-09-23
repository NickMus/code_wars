package FakeBinary;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 21.09.2022
 */
/*
Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'.
Return the resulting string.
Note: input will never be an empty string
 */

public class Main {
    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }


        @Test
        public void testSomething() {
            Main fakeBinary = new Main();
            assertEquals("01011110001100111", fakeBin("45385593107843568"));
            assertEquals("101000111101101", fakeBin("509321967506747"));
            assertEquals("011011110000101010000011011", fakeBin("366058562030849490134388085"));
        }
}
