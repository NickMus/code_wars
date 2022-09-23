package BMI;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 23.09.2022
 */
/*
Write function bmi that calculates body mass index (bmi = weight / height2).
if bmi <= 18.5 return "Underweight"
if bmi <= 25.0 return "Normal"
if bmi <= 30.0 return "Overweight"
if bmi > 30 return "Obese"
 */
public class Main {
    public static String bmi(double weight, double height) {
        String bmi = null;
        if (weight / Math.pow(height, 2) <= 18.5) {
            bmi = "Underweight";
        } else if (weight / Math.pow(height, 2) <= 25.0) {
            bmi = "Normal";
        } else if (weight / Math.pow(height, 2) <= 30.0) {
            bmi = "Overweight";
        } else if (weight / Math.pow(height, 2) > 30.0) {
            bmi = "Obese";
        }
        return bmi;
    }

    @Test
    public void testBMI() {
        assertEquals("Normal", bmi(80, 1.80));
    }
}
