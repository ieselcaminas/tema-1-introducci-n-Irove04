package Ejercicios_refuerzo.src;/*
14)Crea un programa que pida al usuario dos números enteros y diga "Uno de los números es positivo", "Los
dos números son positivos" o bien "Ninguno de los números es positivo", según corresponda.*/

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        //variables
        int num1;
        int num2;

        //lee y pide 2 numero entero
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();


        if (num1 >0 && num2 >0) {
            System.out.println("Los dos son positivos");
        } else  if (num1 > 0 && num2 <0) {
            System.out.println("El segundo numero no es positivo pero el primero si");
        } else if (num1 < 0 && num2 <0) {
            System.out.println("Ninguno es positivo");
        } else if (num1 < 0 && num2 > 0) {
            System.out.println("El segundo es positivo pero el primero no");
        }

    }
}
