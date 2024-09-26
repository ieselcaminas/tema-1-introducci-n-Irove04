/*
152. Write a Java program that accepts four integers from the user and prints equal if all four are equal, and not equal otherwise.
 */

package w3resourceBasicPart2;

import java.util.Scanner;

public class Ejercicio152 {
    public static void main(String[] args) {

        //variables
        int num1;
        int num2;
        int num3;
        int num4;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los numeros: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        num4 = sc.nextInt();

        //condicion
        if (num1 == num2 && num2 == num3 && num3 == num4) {
            System.out.println("Son iguales");
            } else System.out.println("No son iguales");

    }
}
