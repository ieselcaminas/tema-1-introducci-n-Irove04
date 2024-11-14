/*Escribe un programa que pida al usuario 10 números
y que muestre cuántos son positivos.



import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        //variables
        int num1;
        int positivos;

        //lee y pide 10 numeros entero
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 10 numeros::");
        num1 = sc.nextInt();

        //cuando se sabe cuando se va a hacer una acccion
        for (int i = 0;
             i > 10 ;
        i++){
            num = sc.nextInt();
            if (num > 0) {
                positivos++;
            }
        }
        System.out.println("Positivos: " + positivos);
    }
}
*/