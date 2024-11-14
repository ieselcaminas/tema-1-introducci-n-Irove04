/*
Diseña un algoritmo para jugar a “adivinar un número”.
El algoritmo generará un número aleatorio entre 1 y 100,
que llamaremos el número secreto,
y le pedirá al jugador que introduzca un número
hasta que gane o un -1 para rendirse:

    Si el número es igual al número secreto,
    mostrará “Has Ganado” en la pantalla y terminará
    Si el número introducido es mayor que el número secreto, mostrará
    “El número secreto es más pequeño” y le pedirá que introduzca otro.
    Si el número introducido es menor que el número secreto, mostrará
    “El número secreto es más grande” y le pedirá que introduzca otro.
    Si el número introducido es -1, mostrará “Se rinde” y terminará

 */
import java.util.Random;
import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        Random aleatorio = new Random(System.currentTimeMillis());
        Scanner sc = new Scanner(System.in);
        //variables
        int secreto = aleatorio.nextInt(100);
        int num;

        //condicional
        do {
            System.out.println("Introduce un numero del 1 al 100 (-1 para terminar):");
            num = sc.nextInt();

            if (num == secreto) {
                System.out.println("Has ganado");
                break; //se para
            }else if (num < secreto) {
                System.out.println("El numero es mas grande");
            }else if (num > secreto) {
                System.out.println("EL numero es mas pequeño");
            }
        } while (num != -1); //"mientras que el numero no sea -1"

        if (num != -1 ){
            System.out.println("Se rinde");
        }
    }
}
