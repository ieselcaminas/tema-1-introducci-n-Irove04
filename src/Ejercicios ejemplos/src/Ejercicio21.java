/*21) Diseña un algoritmo que lea un año como dato de entrada y que muestre si es un año bisiesto o no. Todos los múltiplos de 400 o los que son múltiples de 4 pero no de 100 son bisiestos.

(Ej. Años bisiestos: 1600, 2000, 2400, 2024. No años bisiestos: 1700, 1800, 1900, 2021..)
*/


import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        //variables
        int num1;

        //lee y pide el año
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el año:");
        num1 = sc.nextInt();


        //indica si el año es bisiesto o no
        if (num1 % 4 ==0 && num1 % 400 ==0)
            System.out.println("El año es bisiesto");
            else{
            System.out.println("El año NO es bisiesto");
        }

    }
}

