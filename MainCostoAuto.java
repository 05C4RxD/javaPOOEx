import java.util.Scanner;

// Clase principal que contiene el método main para ejecutar el programa
class MainCostoAuto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Objeto Scanner para leer la entrada del usuario
        double a; // Variable para almacenar el precio base del auto

        System.out.println("PRECIO DEL AUTO: ");
        a = scan.nextDouble(); // Lee el precio base del auto ingresado por el usuario

        CostoAuto auto = new CostoAuto(); // Crea un objeto de la clase CostoAuto

        auto.a = a; // Establece el precio base del auto directamente (no es una buena práctica)

        auto.ford(); // Llama al método ford() para imprimir el nombre de la marca del auto
        System.out.println("\nPRECIO DEL AUTO: " + auto.Auto()); // Muestra el precio base del auto
        System.out.println("GANANCIA DEL VENDEDOR: " + auto.Vendedor()); // Muestra la ganancia del vendedor
        System.out.println("IMPUESTO: " + auto.Impuestos()); // Muestra el impuesto
        System.out.println("TOTAL A PAGAR: " + auto.Total()); // Muestra el costo total del auto
        System.out.println("    GRACIAS POR SU COMPRA :)"); // Mensaje de agradecimiento
    }
}
