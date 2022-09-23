package RemoveFirstAndLastCharacter;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 22.09.2022
 */

/*
It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string.
You're given one parameter, the original string. You don't have to worry with strings with less than two characters.
 */
public class Main {
    public static void main(String[] args) {
        remove("place");
    }
    public static String remove(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(str.length() - 1);
        sb.deleteCharAt(0);
        return sb.toString();
//        str.substring(1, str.length()-1);
    }

    @Test
    public void testRemoval() {
        assertEquals("loquen", remove("eloquent"));
        assertEquals("ountr", remove("country"));
        assertEquals("erso", remove("person"));
        assertEquals("lac", remove("place"));
    }
}
