import java.util.Scanner;

class MainSegundos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Objeto Scanner para leer la entrada del usuario
        int a; // Variable para almacenar la cantidad de días ingresada por el usuario

        System.out.println("PROGRAMA QUE CALCULA EL NÚMERO DE SEGUNDOS EN UN DÍA");
        System.out.print("\nINGRESA LA CANTIDAD DE DÍAS: ");
        a = scan.nextInt(); // Lee la cantidad de días ingresada por el usuario

        Segundos seg = new Segundos(); // Crea un objeto de la clase Segundos
        seg.setSeg(a); // Establece la cantidad de días en el objeto Segundos utilizando el método setSeg()

        System.out.print("SON " + seg.Seg() + " SEGUNDOS\n"); // Muestra el número total de segundos calculado utilizando el método Seg() del objeto Segundos
    }
}
