package DNA;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 27.09.2022
 */
/*
In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G".
Your function receives one side of the DNA (string, except for Haskell); you need to return the other complementary side.
DNA strand is never empty or there is no DNA at all (again, except for Haskell).
 */
public class Main {
    public static String makeComplement(String dna) {
        //Your code
      return Stream.of(dna).map(s -> s.replace('A','T').replace('T','A')).collect(Collectors.joining());
    }

    @Test
    public void test01() {
        assertEquals("TTTT", makeComplement("AAAA"));
    }

    @Test
    public void test02() {
        assertEquals("TAACG", makeComplement("ATTGC"));
    }

    @Test
    public void test03() {
        assertEquals("CATA", makeComplement("GTAT"));
    }
}
