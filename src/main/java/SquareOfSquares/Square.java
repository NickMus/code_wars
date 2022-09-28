package SquareOfSquares;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 23.09.2022
 */
/*
Given an integral number, determine if it's a square number:
In mathematics, a square number or perfect square is an integer
that is the square of an integer; in other words, it is the product of some integer with itself.
 */
public class Square {
    public static void main(String[] args) {
        isSquare(151967091);
        System.out.println(Math.pow((int) Math.sqrt(151967091), 2) == 151967091);
//        Math.floor()
    }

    public static boolean isSquare(int n) {
        return Math.floor(Math.sqrt(n)) == Math.sqrt(n);
    }

    @Test
    public void shouldWorkForSomeExamples() throws Exception {
        assertEquals("negative numbers aren't square numbers", false, Square.isSquare(-1));
        assertEquals("0 is a square number (0 * 0)", true, Square.isSquare(0));
        assertEquals("3 isn't a square number", false, Square.isSquare(3));
        assertEquals("4 is a square number (2 * 2)", true, Square.isSquare(4));
        assertEquals("25 is a square number (5 * 5)", true, Square.isSquare(25));
        assertEquals("26 isn't a square number", false, Square.isSquare(26));
    }
}
