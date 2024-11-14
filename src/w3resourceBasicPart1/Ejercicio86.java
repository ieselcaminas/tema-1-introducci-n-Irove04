/*
Write a Java program starting with an integer n,
divide it by 2 if it is even, or multiply it by 3 and add 1 if it is odd.
Repeat the process until n = 1.
 */

package w3resourceBasicPart1;

import java.util.Scanner;

public class Ejercicio86 {
    public static void main(String[] args) {

        //variables
        int num1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        num1 = sc.nextInt();

        //condicion
        do {
            if (num1 % 2 == 0) {
                num1 /= 2;
            } else {
                num1 *= 3;
                num1++;
            }
            System.out.println(num1);
        }while (num1 != 1);

        System.out.println(num1);
    }
}
