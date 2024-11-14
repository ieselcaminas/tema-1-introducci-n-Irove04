/*
33. Write a Java program and compute
the sum of an integer's digits.
 */

package w3resourceBasicPart1;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {

        //variables
        int num1;
        int suma = 0;
        int digito;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el numero y sumare sus digitos: ");
        num1 = sc.nextInt();


        //condicion
        do {
            digito = num1 % 10;
            suma += digito;
            num1 = num1 / 10;
        } while (num1 > 0);
        System.out.println("La suma es: " + suma);
    }
}
