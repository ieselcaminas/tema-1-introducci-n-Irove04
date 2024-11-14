package Ejercicios_refuerzo.src;/*
3) Crea un programa que pida al usuario dos números enteros y diga si el primero es múltiplo del segundo
(pista: igual que en el ejercicio P1, habrá que ver si el resto de la división es cero: a % b == 0).*/
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //variables
        int num1;
        int num2;

        //lee y pide 2 numeros entero
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros entero:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 % num2 == 0) {
            System.out.println("Es multiplo");
        }
        else{
            System.out.println("No es multiplo");
        }
    }
}