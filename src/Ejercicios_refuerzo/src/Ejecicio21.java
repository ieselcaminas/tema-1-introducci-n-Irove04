package Ejercicios_refuerzo.src;/*
21)FIN DE MES
 */

import java.util.Scanner;

public class Ejecicio21 {
    public static void main(String[] args) {

        //variables
        double ingresos;
        double gastos;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de ingresos:");
        ingresos = sc.nextDouble();

        System.out.println("Ingrese el valor de gastos:");
        gastos = sc.nextDouble();

        //condicion


        if (ingresos >= 0) {
            if (ingresos <= gastos) {
                System.out.println("SI");
            }
        }
        else {
            System.out.println("NO");
        }
    }
}
