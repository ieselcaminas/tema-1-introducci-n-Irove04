import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        //variables
        String mes;

        //lee y pide los dos valores
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el mes:");
        mes = sc.next();

        switch (mes){
            case "Enero": System.out.println("Enero tiene 31 dias");
                break;
            case "enero": System.out.println("Enero tiene 31 dias");
                break;
            case "Febrero": System.out.println("Febrero tiene 28/29 dias");
                break;
            case "febrero": System.out.println("Febrero tiene 29 dias");
                break;
            case "Marzo": System.out.println("Marzo tiene 31 dias");
                break;
            case "marzo": System.out.println("Marzo tiene 31 dias");
                break;
            case "Abril": System.out.println("Abril tiene 30 dias");
                break;
            case "abril": System.out.println("Abril tiene 30 dias");
                break;
            case "Mayo": System.out.println("Mayo tiene 31 dias");
                break;
            case "mayo": System.out.println("Mayo tiene 31 dias");
                break;
            case "Junio": System.out.println("Junio tiene 30 dias");
                break;
            case "junio": System.out.println("Junio tiene 30 dias");
                break;
            case "Julio": System.out.println("Julio tiene 31 dias");
                break;
            case "julio": System.out.println("Julio tiene 31 dias");
                break;
            case "Agosto": System.out.println("Agosto tiene 31 dias");
                break;
            case "agosto": System.out.println("Agosto tiene 31 dias");
                break;
            case "Septiembre": System.out.println("Septiembre tiene 30 dias");
                break;
            case "septiembre": System.out.println("Septiembre tiene 30 dias");
                break;
            case "Octubre": System.out.println("Octubre tiene 31 dias");
                break;
            case "octubre": System.out.println("Octubre tiene 31 dias");
                break;
            case "Noviembre": System.out.println("Noviembre tiene 30 dias");
                break;
            case "noviembre": System.out.println("Noviembre tiene 30 dias");
                break;
            case "Diciembre": System.out.println("Diciembre tiene 31 dias");
                break;
            case "diciembre": System.out.println("Diciembre tiene 31 dias");
                break;


        }
    }
}
