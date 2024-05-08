// Clase AreaCirculo que calcula y almacena el área de un círculo
class AreaCirculo {
    private double radio; // Atributo para almacenar el radio del círculo

    // Método para calcular y mostrar el área del círculo
    public void calcularArea() {
        // Utiliza la fórmula matemática para calcular el área del círculo (π * radio^2)
        System.out.println("EL ÁREA ES: " + (Math.PI * (this.radio * this.radio)));
    }

    // Método getter para obtener el valor del radio
    public double getRadio() {
        return radio;
    }

    // Método setter para establecer el valor del radio
    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método toString para representar el objeto como una cadena de texto
    @Override
    public String toString() {
        return "AreaCirculo [radio=" + radio + "]";
    }
}
