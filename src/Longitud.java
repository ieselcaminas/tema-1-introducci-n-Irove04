public class Longitud {
    public static void main(String[] args) {
        String cadena = "cama casa clase alumnos";
        String[] palabra = cadena.split(" ");
        int num = 4;
        int contador = 0;

        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].length() == num){
                contador++;

            }

        }
            System.out.println(contador);
    }
}
