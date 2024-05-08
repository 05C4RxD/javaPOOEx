class Segundos {
    int seg; // Almacena la cantidad de días

    // Método para calcular el número total de segundos en la cantidad de días especificada
    public int Seg() {
        return seg * (3600 * 24); // Multiplica la cantidad de días por el número de segundos en un día (24 horas * 3600 segundos)
    }

    // Métodos get y set para acceder y modificar la cantidad de días
    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    // Método toString para representar el objeto en forma de cadena
    @Override
    public String toString() {
        return "Segundos [seg=" + seg + "]";
    }
}
