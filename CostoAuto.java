// Clase CostoAuto que calcula el costo total de un auto
class CostoAuto {
    double a; // Atributo para almacenar el precio base del auto

    // Método para imprimir la marca del auto (en este caso, Ford)
    public void ford() {
        System.out.println("\n            FORD          ");
    }

    // Método para obtener el precio base del auto
    public double Auto() {
        return a;
    }

    // Método para calcular el monto adicional del vendedor (12% del precio base)
    public double Vendedor() {
        return a * 0.12;
    }

    // Método para calcular el monto de impuestos (6% del precio base)
    public double Impuestos() {
        return a * 0.06;
    }

    // Método para calcular el costo total del auto (precio base + monto del vendedor + impuestos)
    public double Total() {
        return a + Vendedor() + Impuestos();
    }

    // Método getter para obtener el valor del precio base del auto
    public double getA() {
        return a;
    }

    // Método setter para establecer el valor del precio base del auto
    public void setA(double a) {
        this.a = a;
    }

    // Método toString para representar el objeto como una cadena de texto
    @Override
    public String toString() {
        return "CostoAuto [a=" + a + "]";
    }
}
