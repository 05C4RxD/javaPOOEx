// Clase Estudiante que representa a un estudiante
class Estudiante {
    private int age; // Atributo para almacenar la edad del estudiante
    private double score; // Atributo para almacenar el puntaje del estudiante
    private String name; // Atributo para almacenar el nombre del estudiante

    // Método para mostrar el nombre del estudiante
    public void mostrarNombre() {
        System.out.println("TU NOMBRE ES: " + this.name);
    }

    // Método para mostrar la edad del estudiante
    public void mostrarEdad() {
        System.out.println("TIENES: " + this.age + " años");
    }

    // Método para mostrar el puntaje del estudiante
    public void mostrarPuntage() {
        System.out.println("TUS PUNTAJES SON: " + this.score);
    }

    // Método getter para obtener el valor de la edad del estudiante
    public int getAge() {
        return age;
    }

    // Método setter para establecer el valor de la edad del estudiante
    public void setAge(int age) {
        this.age = age;
    }

    // Método getter para obtener el valor del puntaje del estudiante
    public double getScore() {
        return score;
    }

    // Método setter para establecer el valor del puntaje del estudiante
    public void setScore(double score) {
        this.score = score;
    }

    // Método getter para obtener el valor del nombre del estudiante
    public String getName() {
        return name;
    }

    // Método setter para establecer el valor del nombre del estudiante
    public void setName(String name) {
        this.name = name;
    }

    // Método toString para representar el objeto como una cadena de texto
    @Override
    public String toString() {
        return "Estudiante [age=" + age + ", score=" + score + ", name=" + name + "]";
    }
}
