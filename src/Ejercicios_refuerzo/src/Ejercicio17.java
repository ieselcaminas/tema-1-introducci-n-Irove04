package Ejercicios_refuerzo.src;/*
17)Crea un programa que pida al usuario dos números enteros y diga si son iguales o, en caso contrario, cuál
es el mayor de ellos
*/

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        //variables
        int num1;
        int num2;

        //lee y pide 2 numero entero
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los 2 numeros:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("Son iguales");
        } else  if (num2 > num1) {
            System.out.println("El primero es menor que el segundo");
        }
            else {
                System.out.println("El primero es mayor que el segundo");
            }
}
}
