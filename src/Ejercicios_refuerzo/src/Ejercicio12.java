package Ejercicios_refuerzo.src;/*
12)Crea un programa que pida al usuario dos números enteros y diga si (al menos) uno es par.*/
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        //variables
        int num1;
        int num2;

        //lee y pide 2 numero entero
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();


        if (num1 % 2 ==0 && num2 % 2 != 0) {
            System.out.println("Minimo uno es par");
        } else
            System.out.println("Ninguno es par");
    }
}
