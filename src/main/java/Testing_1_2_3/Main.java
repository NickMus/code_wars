package Testing_1_2_3;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 27.09.2022
 */
/*
Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.

Write a function which takes a list of strings and returns each line prepended by the correct number.

The numbering starts at 1. The format is n: string. Notice the colon and space in between.

Examples: (Input --> Output)

[] --> []
["a", "b", "c"] --> ["1: a", "2: b", "3: c"]
 */
public class Main {
    public static List<String> number(List<String> lines) {
        // TODO
        for (int i = 0; i < lines.size(); i++) {
           lines.set(i, String.format("%d: %s", i + 1, lines.get(i)));
        }
        return lines;
    }


    @Test
    public void basicTests() {
        assertEquals(Arrays.asList(), number(Arrays.asList()));
        assertEquals(Arrays.asList("1: a", "2: b", "3: c"), number(Arrays.asList("a", "b", "c")));
        assertEquals(Arrays.asList("1: ", "2: ", "3: ", "4: ", "5: "), number(Arrays.asList("", "", "", "", "")));
    }
}
