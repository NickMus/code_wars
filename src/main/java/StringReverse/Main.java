package StringReverse;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 26.09.2022
 */
/*
Write a function that takes in a string of one or more words, and returns the same string,
but with all five or more letter words reversed (Just like the name of this Kata).
Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.
 */
public class Main {
    public static void main(String[] args) {

    }


    public String spinWords(String sentence) {
        return Arrays.stream(sentence.split("\\s"))
                .map(s -> s.length() > 4 ? new StringBuilder(s).reverse().toString() : s)
                .collect(Collectors.joining(" "));
    }


    @Test
    public void test() {
        assertEquals("emocleW", spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", spinWords("Hey fellow warriors"));
    }
}
