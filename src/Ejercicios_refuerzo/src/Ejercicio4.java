package Ejercicios_refuerzo.src;/*
4)Crea un programa que pida al usuario un número entero. Si es múltiplo de 10, informará al usuario y pedirá
un segundo número, para decir a continuación si este segundo número también es múltiplo de 10*/
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //variables
        int num1;
        int num2;

        //lee y pide 1 numero entero
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 1 numero entero:");
        num1 = sc.nextInt();

        if (num1 % 10 == 0) {
            System.out.println("Es multiplo de 10, ahora ingrese otro numero entero:");
            num2 = sc.nextInt();
            if (num2 % 10 == 0) {
                System.out.println("Tambien es multiplo de 10");
                }
        } else {
            System.out.println("No es multiplo");
        }
    }
}