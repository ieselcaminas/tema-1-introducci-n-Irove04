import java.util.Scanner;

public class Ejercicio16 {
        public static void main(String[] args) {
           //variables
            int num1;
            int num2;
            String operacion;

            //lee y pide los dos valores
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el primer numero entero:");
            num1 = sc.nextInt();
            System.out.println("Ingrese el segundo numero entero:");
            num2 = sc.nextInt();

            //eleccion
            System.out.println("Ingrese la operacion:");
            operacion = sc.next();

            switch (operacion){
                case "+": System.out.println(num1 + num2);
                break;
                case "-": System.out.println(num1 - num2);
                break;
                case "*": System.out.println(num1 * num2);
                break;
                case "/": System.out.println(num1 / num2);
                break;
                }


        }
}