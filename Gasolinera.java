// Clase Gasolinera que representa una transacción en una gasolinera
class Gasolinera {
    private double precioLitro; // Precio por litro de combustible
    private double litros; // Cantidad de litros de combustible comprados
    
    // Método para calcular el total a pagar por la cantidad de litros comprados
    public double calcularTotal() {
        // Se calcula el total multiplicando los litros comprados por la conversión de galones a litros y luego por el precio por litro
        return (this.litros * 3.78541) * this.precioLitro;
    }

    // Método getter para obtener el precio por litro de combustible
    public double getPrecioLitro() {
        return precioLitro;
    }

    // Método setter para establecer el precio por litro de combustible
    public void setPrecioLitro(double precioLitro) {
        this.precioLitro = precioLitro;
    }

    // Método getter para obtener la cantidad de litros de combustible comprados
    public double getLitros() {
        return litros;
    }

    // Método setter para establecer la cantidad de litros de combustible comprados
    public void setLitros(double litros) {
        this.litros = litros;
    }

    // Método toString para representar el objeto como una cadena de texto
    @Override
    public String toString() {
        return "Gasolinera [precioLitro=" + precioLitro + ", litros=" + litros + "]";
    }   
}
