import java.util.Scanner;

// Clase principal que contiene el método main para ejecutar el programa
class MainConversionTemp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Objeto Scanner para leer la entrada del usuario
        double a; // Variable para almacenar los grados Celsius ingresados por el usuario

        System.out.println("CONVERSIÓN DE GRADOS CENTÍGRADOS A FARENHEIT");
        System.out.println("INGRESA LOS GRADOS CENTÍGRADOS: ");
        a = scan.nextInt(); // Lee los grados Celsius ingresados por el usuario

        ConversionTemp conversionTemp = new ConversionTemp(); // Crea un objeto de la clase ConversionTemp
        conversionTemp.setA(a); // Establece los grados Celsius utilizando el método setA()

        conversionTemp.mostrarResultado(); // Llama al método mostrarResultado() para mostrar el resultado de la conversión
    }
}
