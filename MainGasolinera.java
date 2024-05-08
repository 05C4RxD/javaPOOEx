import java.util.Scanner; // Importa la clase Scanner del paquete java.util, que permite leer la entrada del usuario

class MainGasolinera { // Define la clase MainGasolinera
    public static void main(String[] args) { // Define el método principal main
        Scanner scan = new Scanner(System.in); // Crea un objeto Scanner llamado scan para leer la entrada del usuario

        double galon, precio; // Declara dos variables double llamadas galon y precio

        System.out.println("INGRESE LA CANTIDAD DE LITROS: "); // Muestra un mensaje pidiendo al usuario que ingrese la cantidad de litros de combustible
        galon = scan.nextDouble(); // Lee la cantidad de litros de combustible ingresada por el usuario y la asigna a la variable galon

        System.out.println("INGRESE EL PRECIO DEL GALÓN: "); // Muestra un mensaje pidiendo al usuario que ingrese el precio por galón
        precio = scan.nextDouble(); // Lee el precio por galón ingresado por el usuario y lo asigna a la variable precio

        Gasolinera gas = new Gasolinera(); // Crea un objeto Gasolinera llamado gas

        gas.setLitros(galon); // Establece la cantidad de litros de combustible en el objeto gas utilizando el método setLitros
        gas.setPrecioLitro(precio); // Establece el precio por galón en el objeto gas utilizando el método setPrecioLitro

        System.out.println("EL TOTAL A PAGAR ES: " + gas.calcularTotal()); // Muestra el total a pagar, que es calculado llamando al método calcularTotal del objeto gas
    }
}
