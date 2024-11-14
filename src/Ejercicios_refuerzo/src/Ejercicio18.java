package Ejercicios_refuerzo.src;/*
18. Realiza un programa que pida un número y muestre por
pantalla los 5 primeros números pares a partir de
él (prueba a introducir un número par y otro impar (M
 */

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {

        //variables
        int num1;
        int num_par = 0;
        int num_impar = 0;
        int sumar = 2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el un numero: ");
        num1 = sc.nextInt();

        //condicion par

        if (num1  % 2 == 0){
            for (int i = 2; i <= 10; i = i +2){
                num_par = num1 + i;
                System.out.println(num_par);
            }
        }

        //condicion impar

        if (num1 % 2 != 0){
            num_impar = num1 + 1;
            System.out.println(num_impar);

            for (int i = 1; i<= 4; i++){
             num_impar = num_impar + sumar;

                System.out.println(num_impar);
            }
        }
    }
}
