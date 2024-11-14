/*
Ej24) Diseña un algoritmo que lea un conjunto de notas
del teclado hasta que se introduzca -1 y muestre la nota media y si había un 10 o no.
 */
import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {

        //variables
        int num1;
        int suma = 0;
        int cuantas = 0;
        boolean excelente = false;
        float media;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa numeros: ");

        do{
            num1 = sc.nextInt();

            if (num1 >= 0 && num1 <= 10) {

                cuantas++;
                suma = suma + num1;
            }
            if (num1 == 10){
                excelente = true;
            }

        } while (num1 != -1);

        if (excelente == true){
            System.out.println("Hay un 10.");
        }

        media = (float) suma /cuantas;

        System.out.println("La nota media es: " + media);

        }
    }

