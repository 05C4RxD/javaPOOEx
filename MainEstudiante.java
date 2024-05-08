import java.util.Scanner;

// Clase principal que contiene el método main para ejecutar el programa
class MainEstudiante {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Objeto Scanner para leer la entrada del usuario
        int age; // Variable para almacenar la edad del estudiante
        double score; // Variable para almacenar la calificación del estudiante
        String name; // Variable para almacenar el nombre del estudiante

        System.out.print("INGRESE SU NOMBRE: ");
        name = scan.nextLine(); // Lee el nombre del estudiante ingresado por el usuario
        System.out.print("INGRESA TU EDAD: ");
        age = scan.nextInt(); // Lee la edad del estudiante ingresada por el usuario
        System.out.print("INGRESA TU CALIFICACIÓN: ");
        score = scan.nextDouble(); // Lee la calificación del estudiante ingresada por el usuario

        Estudiante estudiante = new Estudiante(); // Crea un objeto de la clase Estudiante

        // Verifica si la edad y la calificación son válidas
        if (age <= 0 && score <= 0) {
            System.out.println("EDAD Y CALIFICACIÓN INVÁLIDAS");
        } else if (age <= 0) {
            System.out.println("EDAD INVÁLIDA");
        } else if (score <= 0) {
            System.out.println("CALIFICACIÓN INVÁLIDA");
        } else {
            estudiante.setAge(age); // Establece la edad del estudiante utilizando el método setAge()
            estudiante.setName(name); // Establece el nombre del estudiante utilizando el método setName()
            estudiante.setScore(score); // Establece la calificación del estudiante utilizando el método setScore()

            estudiante.mostrarNombre(); // Llama al método mostrarNombre() para mostrar el nombre del estudiante
            estudiante.mostrarEdad(); // Llama al método mostrarEdad() para mostrar la edad del estudiante
            estudiante.mostrarPuntage(); // Llama al método mostrarPuntage() para mostrar la calificación del estudiante
        }
    }
}
