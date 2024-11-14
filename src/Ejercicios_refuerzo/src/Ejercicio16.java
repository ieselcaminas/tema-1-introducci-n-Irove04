package Ejercicios_refuerzo.src;/*
16)Crea un programa que pida al usuario tres números y muestre cuál es el mayor de los tres.
*/

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        //variables
        int num1;
        int num2;
        int num3;

        //lee y pide 3 numero entero
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los segundos a calcular:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        if (num1 >=num2 && num1 >=num3) {
            System.out.println("El numero mas grande es el: " + num1);
        } else  if (num2 >=num1 && num2 >=num3) {
            System.out.println("El numero mas grande es el: " + num2);
        } else if (num3 >=num1 && num2 >=num2) {
            System.out.println("El numero mas grande es el: " + num3);
        }

    }
}