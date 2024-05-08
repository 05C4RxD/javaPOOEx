import java.util.Scanner;

class MainAreaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Objeto Scanner para leer la entrada del usuario
        int a, b; // Variables para almacenar la altura y la base del triángulo

        System.out.println("PROGRAMA QUE CALCULA EL ÁREA DE UN TRIÁNGULO");

        do {
            System.out.print("\nINGRESE LA BASE: ");
            b = sc.nextInt(); // Lee la base del triángulo ingresada por el usuario
            System.out.print("INGRESE LA ALTURA: ");
            a = sc.nextInt(); // Lee la altura del triángulo ingresada por el usuario

            AreaTriangulo tri = new AreaTriangulo(); // Crea un objeto de la clase AreaTriangulo
            tri.setB(b); // Establece la base del triángulo en el objeto AreaTriangulo utilizando el método setB()
            tri.setH(a); // Establece la altura del triángulo en el objeto AreaTriangulo utilizando el método setH()

            System.out.print("EL ÁREA ES: " + tri.mostrarArea()); // Muestra el área del triángulo utilizando el método mostrarArea()
        } while (b != 0 && a != 0); // Repite el bucle mientras la base y la altura del triángulo sean diferentes de cero

        System.out.println("\n  CERRANDO PROGRAMA, HASTA LUEGO :)"); // Mensaje de despedida
    }
}
