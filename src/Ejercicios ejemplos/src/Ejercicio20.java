import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        //variables
        int num1;

        //lee y pide 1 numero entero
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio:");
        num1 = sc.nextInt();

        //Calcula el descuento

        if (num1 < 6){
            System.out.println("No hay descuento por que es menor de 6€");
        }else if    (num1 >= 6 && num1 <= 60) {
            System.out.println(num1 - num1 * 0.05 + " " + "Aplicado el 5%");
        } else  if (num1 >= 60) {
            System.out.println(num1 - num1 * 0.10 + " " + "Aplicado el 10%");
        }
    }
}
