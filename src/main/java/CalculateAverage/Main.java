package CalculateAverage;

import java.util.Arrays;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 21.09.2022
 */

/*
Write a function which calculates the average of the numbers in a given list.
Note: Empty arrays should return 0.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        find_average(arr);
    }

    public static double find_average(int[] array) {
        return Arrays.stream(array).average().orElse(0);
    }
}

