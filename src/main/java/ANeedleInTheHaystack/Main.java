package ANeedleInTheHaystack;

import java.util.Arrays;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 21.09.2022
 */

/*
Write a function that takes an full of junk but containing one findNeedle()array"needle"
After your function finds the needle it should return a message (as a string) that says:
"found the needle at position " plus the it found the needle, so: index
 */
public class Main {
    public static void main(String[] args) {
        Object[] haystack2 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        findNeedle(haystack2);
    }


    public static String findNeedle(Object[] haystack) {
        int index;
        String str = "needle";
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] != null && haystack[i].equals(str)) {
                index = i;
                str = String.format("found the needle at position %s", index);
            }
        }
        return str;
//        return String.format("found the needle at position %d", Arrays.asList(haystack).indexOf("needle"));
    }
}
