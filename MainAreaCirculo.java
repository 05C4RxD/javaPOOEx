import java.util.Scanner;

// Clase principal que contiene el método main para ejecutar el programa
class MainAreaCirculo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Objeto Scanner para leer la entrada del usuario
        double radio; // Variable para almacenar el radio del círculo

        System.out.println("PROGRAMA QUE CALCULA EL ÁREA DE UN CÍRCULO");

        do {
            System.out.println("\nINGRESA EL RADIO: ");
            radio = scan.nextDouble(); // Lee el radio del círculo ingresado por el usuario

            AreaCirculo area = new AreaCirculo(); // Crea un objeto de la clase AreaCirculo
            area.setRadio(radio); // Establece el radio del círculo utilizando el método setRadio()

            area.calcularArea(); // Llama al método calcularArea() para calcular y mostrar el área del círculo

        } while (radio != 0); // Repite el bucle hasta que el usuario ingrese un radio igual a 0

        System.out.println("\n    CERRANDO PROGRAMA, ¡HASTA LUEGO :)"); // Mensaje de despedida
    }
}
