// Clase ConversorDolar que realiza la conversión de pesos a dólares
class ConversorDolar {
    double peso; // Atributo para almacenar la cantidad de pesos

    // Método para mostrar el resultado de la conversión a dólares
    public double mostrarResultado() {
        return (peso / 17); // Realiza la conversión dividiendo la cantidad de pesos entre el tipo de cambio
    }

    // Método getter para obtener el valor de la cantidad de pesos
    public double getPeso() {
        return peso;
    }

    // Método setter para establecer el valor de la cantidad de pesos
    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Método toString para representar el objeto como una cadena de texto
    @Override
    public String toString() {
        return "ConversorDolar [peso=" + peso + "]";
    }
}
