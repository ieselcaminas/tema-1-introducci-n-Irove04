/*
EJ)35Realiza un programa que calcule el resto de
una división usando el metodo de las restas sucesivas
 */

import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        //Variables
        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);

        //Pide los numeros
        System.out.println("Ingrese los numeros: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        //Resta usando do while
        do {
            num1 = num1 - num2;
        } while (num1 >= num2);
        System.out.println("EL resultado es: " + num1);
    }
}
