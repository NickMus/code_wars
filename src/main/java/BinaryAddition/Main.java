package BinaryAddition;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 21.09.2022
 */

/*
Implement a function that adds two numbers together and returns their sum in binary.
The conversion can be done before,or after the addition.
        The binary number returned should be a string.
        Examples:(Input1,Input2-->Output(explanation)))
        1,1-->"10"(1+1=2in decimal or 10in binary)
        5,9-->"1110"(5+9=14in decimal or 1110in binary)
*/
public class Main {
    public static void main(String[] args) {
        transformationToBinary(5, 9);
    }

    public static String transformationToBinary(int a, int b) {
        int sum = a + b;
        return Integer.toBinaryString(sum);
    }
}

