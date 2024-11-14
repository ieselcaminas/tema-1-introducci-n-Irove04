package Ejercicios_refuerzo.src;/*
6)Crea un programa que pida al usuario dos números enteros. Si el segundo no es cero, mostrará el
resultado de dividir el primero entre el segundo. Por el contrario, si el segundo número es cero, escribirá
"Error: No se puede dividir entre cero"*/
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        //variables
        int num1;
        int num2;

        //lee y pide 1 numero entero
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese primer numero entero:");
        num1 = sc.nextInt();


        System.out.println("Ingrese el otro numero entero:");
        num2 = sc.nextInt();

        if (num2 == 0) {
            System.out.println("No se puede dividir entre 0");
        }
        else{
            System.out.println(num1 / num2);

        }

    }
}