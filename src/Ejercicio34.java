/*
Ej34)Realiza un programa que calcule la multiplicación
de dos números usando el metodo de las sumas sucesivas
 */

import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {

        //variables
        int num1;
        int num2;
        int resultado = 0;

        Scanner sc = new Scanner(System.in);

        //pide los dos numeros para hacer la multiplicacion
        System.out.println("Ingrese los numeros: ");
        num2 = sc.nextInt();
        num1 = sc.nextInt();

        //

        for (int i = 1; i <= num2; i++) {
            resultado = resultado + num1;
        }
        System.out.println("El resultado es: " + resultado);
        }
    }

