package PhoneFormat;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 23.09.2022
 */
/*
Write a function that accepts an array of 10 integers (between 0 and 9),
that returns a string of those numbers in the form of a phone number.
Example
Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
 */
public class Main {
    public static void main(String[] args) {
        createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
    }
    public static String createPhoneNumber(int[] numbers) {
        // Your code here!
      return String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(numbers).boxed().toArray());
    }

    @Test
    public void tests() {
        assertEquals("(123) 456-7890", createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}
