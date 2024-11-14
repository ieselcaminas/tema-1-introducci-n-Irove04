package Ejercicios_refuerzo.src;/*
11)Crea un programa que pida al usuario dos números enteros y diga si ambos son pares*/
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        //variables
        int num1;
        int num2;

        //lee y pide 2 numero entero
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();


        if (num1 % 2 ==0 && num2 % 2 == 0) {
            System.out.println("Ambos son pares");
        } else
            System.out.println("No son pares");
    }
}
