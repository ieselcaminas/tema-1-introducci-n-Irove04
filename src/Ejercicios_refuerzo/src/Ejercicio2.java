package Ejercicios_refuerzo.src;/*
2) Crea un programa que pida al usuario un número entero y diga si es par (pista: habrá que comprobar si el
resto que se obtiene al dividir entre dos es cero: if (x % 2 == 0) ...).
 */
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //variables
        int num1;

        //lee y pide 1 numero entero
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 1 numero entero:");
        num1 = sc.nextInt();

        if (num1 % 2 ==0) {
            System.out.println("Es par");
        }
        else{
            System.out.println("No es par");
        }
    }
}