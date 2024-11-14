package Ejercicios_refuerzo.src;/*
5)Crea un programa que multiplique dos números enteros de la siguiente forma: pedirá al usuario un primer
número entero. Si el número que se que teclee es 0, escribirá en pantalla "El producto de 0 por cualquier
número es 0". Si se ha tecleado un número distinto de cero, se pedirá al usuario un segundo número y se
mostrará el producto de ambos.*/


import java.util.Scanner;

public class Ejercicio5 {
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

        if (num1 == 0 || num2 == 0) {
            System.out.println("Cualquier numero multiplicado por 0 es 0");
                }
        else{
            System.out.println(num1  * num2);

        }

    }
}