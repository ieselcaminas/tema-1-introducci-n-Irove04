/*
Ej31)DRealiza un programa que pida un número natural y
escriba sus divisores
 */

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {

        //variables
        int num1;
        Scanner sc = new Scanner(System.in);

        //lee un caracter como int
        System.out.println("Introduce un numero: ");
        num1 = sc.nextInt();

        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                System.out.println(i);
            }
        }
    }
}
