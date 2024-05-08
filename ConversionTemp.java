// Clase ConversionTemp que realiza la conversión de temperatura de Celsius a Fahrenheit
class ConversionTemp {
    private double a; // Atributo para almacenar la temperatura en grados Celsius

    // Método para mostrar el resultado de la conversión de Celsius a Fahrenheit
    public void mostrarResultado() {
        // Realiza la conversión de Celsius a Fahrenheit utilizando la fórmula matemática
        System.out.println(((this.a * 9/5) + 32) + " GRADOS FAHRENHEIT");
    }

    // Método getter para obtener el valor de la temperatura en Celsius
    public double getA() {
        return a;
    }

    // Método setter para establecer el valor de la temperatura en Celsius
    public void setA(double a) {
        this.a = a;
    }

    // Método toString para representar el objeto como una cadena de texto
    @Override
    public String toString() {
        return "ConversionTemp [a=" + a + "]";
    }
}
