
/*
Ej)25 Diseña un programa que calcule el factorial de un número
 */
import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {

        //variables
        long factorial = 1;
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        num = sc.nextInt();
        for (int i = 1;
             i <= num;
             i++) {
            factorial = factorial * i;
        }
    }
}


