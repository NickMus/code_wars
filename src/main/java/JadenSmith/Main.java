package JadenSmith;

import org.junit.Ignore;
import org.junit.Test;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 22.09.2022
 */
/*
Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013).
Jaden is also known for some of his philosophy that he delivers via Twitter.
When writing on Twitter, he is known for almost always capitalizing every word.
For simplicity, you'll have to capitalize each word, check out how contractions are expected to be in the example below.
Your task is to convert strings to how they would be written by Jaden Smith.
The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.
Example:

Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
 */
public class Main {
    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()  ) {
            return null;
        }
        return Stream.of(phrase.trim().split("\\s"))
                .filter(string -> string.length() > 0)
                .map(string -> string.substring(0, 1).toUpperCase() + string.substring(1))
                .collect(Collectors.joining(" "));

    }


    @Test
    public void test() {
        assertEquals("toJadenCase doesn't return a valide JadenCase String! try again please :)",
                "Most Trees Are Blue", toJadenCase("most trees are blue"));
    }

    @Test()
    public void testNullArg() {
        assertNull("Must return null when the arg is null", toJadenCase(null));
    }

    @Test
    public void testEmptyArg() {
        assertNull("Must return null when the arg is empty string", toJadenCase(""));
    }

}
