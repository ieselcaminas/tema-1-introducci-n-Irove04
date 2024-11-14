package Ejercicios_refuerzo.src;/*
7)Crea un programa que pida al usuario dos números enteros. Si el segundo no es cero, mostrará el
resultado de dividir el primero entre el segundo. Por el contrario, si el segundo número es cero, escribirá
"Error: No se puede dividir entre cero"*/
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        //variables
        int num1;

        //lee y pide 1 numero entero
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese primer numero entero:");
        num1 = sc.nextInt();


        if (num1 % 2 == 0) {
            System.out.println("Es multiplo de 2");
        }
        else{
                if (num1 % 3 == 0){
                    System.out.println("Es multiplo de 3");
                }
                else{
                    System.out.println("NO es multiplo ni de 2 ni de 3");}
            }

        }

    }
