package Ejercicios_refuerzo.src;/*
19. Radares de tramo (M)
 */
import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {

        //variables
        double metros;
        double vel_max;
        double segundos;
        double km;
        double horas;
        double vel_max_calc;

        double puntos;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la distancia (metros):");
        metros = sc.nextDouble();
        System.out.println("Ingrese los segundos:");
        segundos = sc.nextDouble();

        System.out.println("Ingrese la velocidad maxima (vel_max):");
        vel_max = sc.nextDouble();

        km =  metros / 1000;
        horas = segundos /3600;
        vel_max_calc = km / horas;

        puntos = vel_max * 0.20;

        if (vel_max_calc < vel_max) {
            System.out.println("OK");
        } else if (vel_max_calc < vel_max && vel_max_calc < puntos) {
            System.out.println("MULTA");
        } else if (vel_max_calc > puntos) {
            System.out.println("PUNTOS");
        } else System.out.println("ERROR");
    }
}
