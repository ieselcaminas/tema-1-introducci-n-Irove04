package Ejercicios_refuerzo.src;/*
9)Crea un programa que pida al usuario un número entero y responda si es múltiplo de 2 pero no de 3*/
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        //variables
        int num1;

        //lee y pide 1 numero entero
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese primer numero entero:");
        num1 = sc.nextInt();


        if (num1 % 2 == 0 && num1 % 3 != 0) {
            System.out.println("SI es multiplo de 2 pero no de 3");
        } else
            System.out.println("NO es multiplo de 2 y de 3");
        }

}


