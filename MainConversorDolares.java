import java.util.Scanner;

// Clase principal que contiene el método main para ejecutar el programa
class MainConversorDolar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Objeto Scanner para leer la entrada del usuario
        double a; // Variable para almacenar la cantidad de pesos ingresada por el usuario

        System.out.println("PROGRAMA CONVERTIDOR DE PESOS A DÓLARES");
        System.out.print("\nINGRESA LA CANTIDAD DE PESOS: ");
        a = scan.nextInt(); // Lee la cantidad de pesos ingresada por el usuario

        ConversorDolar con = new ConversorDolar(); // Crea un objeto de la clase ConversorDolar
        con.setPeso(a); // Establece la cantidad de pesos utilizando el método setPeso()

        System.out.print("SON " + con.mostrarResultado() + " DÓLARES\n"); // Muestra el resultado de la conversión
    }
}
