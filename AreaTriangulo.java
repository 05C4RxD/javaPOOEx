// Clase AreaTriangulo que calcula y almacena el área de un triángulo
class AreaTriangulo {
    private int b, h; // Atributos para almacenar la base y la altura del triángulo

    // Método para calcular y devolver el área del triángulo
    public int mostrarArea() {
        // Utiliza la fórmula matemática para calcular el área del triángulo (base * altura) / 2
        return (this.b * this.h) / 2;
    }

    // Método getter para obtener el valor de la base
    public int getB() {
        return b;
    }

    // Método setter para establecer el valor de la base
    public void setB(int b) {
        this.b = b;
    }

    // Método getter para obtener el valor de la altura
    public int getH() {
        return h;
    }

    // Método setter para establecer el valor de la altura
    public void setH(int h) {
        this.h = h;
    }

    // Método toString para representar el objeto como una cadena de texto
    @Override
    public String toString() {
        return "AreaTriangulo [b=" + b + ", h=" + h + "]";
    }
}
