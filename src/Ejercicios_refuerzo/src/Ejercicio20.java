package Ejercicios_refuerzo.src;/*
20)Me quiere, no me quiere
 */
import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {

        //variables
        int num_hojas;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de hojas: ");
        num_hojas = sc.nextInt();

        //condicional
        if (num_hojas <3) {
            System.out.println("IMPOSIBLE");
        }

        else {
            System.out.println(num_hojas / 4);
        }
    }
}
