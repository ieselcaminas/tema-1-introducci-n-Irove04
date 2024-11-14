import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        //variables
        int seg;
        int min;
        int hor;

        //lee y pide los dos valores
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese las horas:");
        hor = sc.nextInt();
        System.out.println("Ingrese los minutos:");
        min = sc.nextInt();
        System.out.println("Ingrese los segundos:");
        seg = sc.nextInt();

        //añadimos segundos
        seg = seg + 1;
        if (seg > 59) {
            seg = 0;
            min = min +1;
        }

        //muestra la hora calculada
        System.out.println("La nueva hora es:" + hor + ":" + min + ":" + seg);
    }
}
