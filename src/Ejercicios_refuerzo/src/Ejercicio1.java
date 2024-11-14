package Ejercicios_refuerzo.src;/*
1) Escribe un programa Java que dado un número entero obtiene y muestra por pantalla el doble y el triple de
ese número.
 */
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //variables
        int num1;

        //lee y pide 1 numero entero
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 1 numero entero:");
        num1 = sc.nextInt();

        System.out.println("Doble:" + num1 * 2 + " " + "Triple:" + num1 * 3);
    }
}

