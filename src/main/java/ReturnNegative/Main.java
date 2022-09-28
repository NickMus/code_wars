package ReturnNegative;

import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 27.09.2022
 */
/*
In this simple assignment you are given a number and have to make it negative.
But maybe the number is already negative?
 */
public class Main {
    public static int makeNegative(final int x) {
//       return IntStream.of(x).filter(s -> s > 0).map(s-> s*=-1);
        return x > 0 ? x * -1 : x;
    }

        @Test
        public void test1 () {
            assertEquals(-42, makeNegative(42));
        }
    }
