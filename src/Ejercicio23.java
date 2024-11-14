/*
Escribe un programa que pida al usuario n números y que muestre cuántos son positivos
(para acabar el programa, el usuario debe introducir el número 0)
 */

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {

        //variables
        int n;
        int sumapositivos = 0;

        Scanner sc = new Scanner(System.in);

        //se mira la condicion al final del ciclo en vez de al principio
       do {
           System.out.print("Ingresa los numeros que quieras (pulsa 0 cuando quieras acabar): ");
           n = sc.nextInt();

           if (n > 0) {
               sumapositivos++;
           }
       } while (n != 0);
                System.out.println("Has ingresado " + sumapositivos + " numeros positivos.");
       }
    }
