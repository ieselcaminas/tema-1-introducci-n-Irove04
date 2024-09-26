/*
Write a Java program to calculate the sum of two integers
and return true if the sum is equal to a third integer.
 */

package w3resourceBasicPart1;

import java.util.Scanner;

public class Ejercicio52 {
    public static void main(String[] args) {

        //variables
        int num1;
        int num2;
        int num3;
        boolean comprobar;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tres numeros: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        comprobar = num1 + num2 == num3;
        System.out.println("True." + comprobar);

    }
}
