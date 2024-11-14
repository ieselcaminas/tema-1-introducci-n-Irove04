/*
Escribe un programa que muestre si un número es primo o no.

Los números primos tienen la siguiente característica:
un número primo es solamente divisible por sí mismo y por la unidad, por tanto,
un número primo no puede ser par excepto el 2.

Para saber si un número impar es primo, dividimos dicho número
por todos los números impares comprendidos entre 3 y la mitad de dicho número.

Por ejemplo, para saber si 13 es un número primo basta dividirlo por 3, y 5.
Para saber si 25 es número primo se divide entre 3, 5, 7, 9, y 11.
Si el resto de la división (operación módulo %) es cero, el número no es primo.
 */
import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
            //variables
            int num1;
            boolean primo = true;

            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa un numero y te dire si es primo: ");
            num1 = sc.nextInt();

            //condicional
        if (num1 == 2) {
            primo = true;
        }else {
            for (int i = 2; i < num1; i++) {
                if (num1 % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        if (primo){
            System.out.println("El numero es primo.");
        } else {
            System.out.println("El numero no es primo.");
        }
    }
}
