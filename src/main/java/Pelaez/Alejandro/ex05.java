/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package Pelaez.Alejandro;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args)
    {
        System.out.print("What is the first number? ");
        Scanner input = new Scanner(System.in);
        String numOne = input.next();

        System.out.print("What is the second number? ");
        String numTwo = input.next();

        float fOne = Float.parseFloat(numOne);
        float fTwo = Float.parseFloat(numTwo);
        System.out.printf("%.2f + %.2f = %.2f\n%.2f - %.2f = %.2f\n%.2f * %.2f = %.2f\n%.2f / %.2f = %.2f\n",
                fOne, fTwo, sum(fOne, fTwo), fOne, fTwo, sub(fOne, fTwo),
                fOne, fTwo, mult(fOne, fTwo), fOne, fTwo, div(fOne, fTwo));
    }

    private static float sum(float numOne, float numTwo)
    {
        return numOne + numTwo;
    }
    private static float sub(float numOne, float numTwo)
    {
        return numOne - numTwo;
    }
    private static float mult(float numOne, float numTwo)
    {
        return numOne * numTwo;
    }
    private static float div(float numOne, float numTwo)
    {
        return numOne / numTwo;
    }
}
