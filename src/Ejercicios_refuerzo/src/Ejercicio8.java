package Ejercicios_refuerzo.src;/*
8)Crea un programa que pida al usuario un número entero
y responda si es múltiplo de 2 y de 3
simultáneamente*/
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        //variables
        int num1;

        //lee y pide 1 numero entero
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese primer numero entero:");
        num1 = sc.nextInt();


        if (num1 % 2 == 0 || num1 % 3 == 0) {
            System.out.println("Es multiplo de 2 o de 3");
        }
        else{
                System.out.println("NO es multiplo o de 2 o de 3");}
        }

    }


