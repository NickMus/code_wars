package GrowthPopulation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 23.09.2022
 */
/*
In a small town the population is p0 = 1000 at the beginning of a year.
The population regularly increases by 2 percent per year and moreover 50 new inhabitants per year come to live in the town.
How many years does the town need to see its population greater or equal to p = 1200 inhabitants?
At the end of the first year there will be:
1000 + 1000 * 0.02 + 50 => 1070 inhabitants

At the end of the 2nd year there will be:
1070 + 1070 * 0.02 + 50 => 1141 inhabitants (** number of inhabitants is an integer **)

At the end of the 3rd year there will be:
1141 + 1141 * 0.02 + 50 => 1213

It will need 3 entire years.
 */
public class Main {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int count = 0;
        while (p0 < p) {
            p0 = (int) ((p0 * percent) / 100) + p0 + aug;
            count++;
        }
        return count;
    }

    @Test
    public void test1() {
        System.out.println("Fixed Tests: nbYear");
        assertEquals(15, nbYear(1500, 5, 100, 5000));
        assertEquals(10, nbYear(1500000, 2.5, 10000, 2000000));
        assertEquals(94, nbYear(1500000, 0.25, 1000, 2000000));
    }
}
