package Ejercicios_refuerzo.src;/*
Realiza un programa con una variable entera t la cual contiene un tiempo en segundos y queremos conocer
este tiempo pero expresado en horas, minutos y segundos
*/

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        //variables
        int seg;
        int min;
        int hor;

        //lee y pide 2 numero entero
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los segundos a calcular:");
        seg = sc.nextInt();

        //calcula la hora, minutos y segundos
        hor = seg / 3600;
        seg = seg % 3600;
        min = seg / 60;
        seg = seg % 60;
        System.out.println("El calculo es:" + hor + ":" + min + ":" + seg);

    }
}
