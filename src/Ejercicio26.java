/*
ej)26 Escribe un programa que lea un número y escriba su tabla de multiplicación
 */
import java.util.Scanner;



public class Ejercicio26 {
    public static void main(String[] args) {

        //variables
        int num1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        num1 = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num1 + " x " + i + " = " + (num1 * i));
        }
    }
}