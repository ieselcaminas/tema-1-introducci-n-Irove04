/*
36)Realiza un programa que lea un número entero
decimal (máximo 255) e imprima su valor en binario
 */
import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variables
        int num;
        int resto;
        String binario = "";

        //condicional
            System.out.println("Ingrese el numero decimal(MAX 255): ");
            num = sc.nextInt();
            while (num != 0) {
                resto = num % 2;
                num = num / 2;
                binario = resto + binario;
            }
        System.out.println(binario);
    }
}