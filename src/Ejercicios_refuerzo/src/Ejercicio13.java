package Ejercicios_refuerzo.src;/*
13)Crea un programa que pida al usuario dos números enteros y diga si uno y sólo uno es par*/

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        //variables
        int num1;
        int num2;

        //lee y pide 2 numero entero
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();


        if (num1 % 2 ==0 && num2 % 2 !=0) {
            System.out.println("El primer numero es par el segundo no");
        } else  if (num1 % 2 != 0 && num2 % 2 ==0) {
            System.out.println("El segundo numero no es par pero el primero si");
        }

    }
}
