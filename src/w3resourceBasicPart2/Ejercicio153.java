/*
153. Write a Java program that accepts two double variables
and test if both strictly between 0 and 1 and false otherwise.
 */

package w3resourceBasicPart2;

import java.util.Scanner;

public class Ejercicio153 {
    public static void main(String[] args) {

        //variables
        double num1;
        double num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los numeros: ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();

        //condicion
        if (num1 >= 0 && num1 <= 1 && num2 >= 0 && num2 <= 1) {
            System.out.println("True.");
        } else {
            System.out.println("False.");
        }
    }
}
