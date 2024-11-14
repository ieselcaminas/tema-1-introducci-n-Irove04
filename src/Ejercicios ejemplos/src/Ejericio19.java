/*
Diseña un algoritmo que calcule el salario neto de un trabajador en
función del número de horas de trabajo y los impuestos según las siguientes reglas: (D)
 */
import java.util.Scanner;

public class Ejericio19 {
    public static void main(String[] args) {
        //variables
        int hora;
        double precio;
        double bruto;
        double impuestos;

        //lee y pide 1 numero entero
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de horas");
        hora = sc.nextInt();
        System.out.println("Ingrese el precio por hora");
        precio = sc.nextDouble();

        if (hora <= 35){
            bruto = precio * hora;
        } else {
            bruto = 35 * precio + (hora - 35) * precio * 1.5;
        }
        System.out.println("El salario bruto es: " + bruto);

        if (bruto <= 500){
            impuestos = 0;

        } else if (bruto <= 900){
            impuestos = bruto - 500 * 0.25;
        } else {
                impuestos = (400 * 0.25) + (bruto - 500 - 400) * 0.45;
        }
        System.out.println("El salario bruto es " + bruto);
        System.out.println("Los impuestos son: " + impuestos);
        System.out.println("El salario neto es: "+ (bruto - impuestos));

    }
}
