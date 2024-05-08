import java.util.Random;

class Password {
    private int longitud; // Almacena la longitud de la contraseña
    private String contraseña; // Almacena la contraseña

    // Constructor por defecto que crea una contraseña de longitud 8
    public Password() {
        this.longitud = 8;
        generarPassword(); // Llama al método para generar una contraseña
    }

    // Constructor que permite especificar la longitud de la contraseña
    public Password(int longitud) {
        this.longitud = longitud;
        generarPassword(); // Llama al método para generar una contraseña
    }

    // Método para comprobar si la contraseña es fuerte
    public boolean esFuerte() {
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        // Recorre la contraseña y cuenta el número de mayúsculas, minúsculas y números
        for (int i = 0; i < contraseña.length(); i++) {
            char caracter = contraseña.charAt(i);
            if (Character.isUpperCase(caracter)) {
                mayusculas++;
            } else if (Character.isLowerCase(caracter)) {
                minusculas++;
            } else if (Character.isDigit(caracter)) {
                numeros++;
            }
        }

        // Retorna verdadero si la contraseña cumple con los requisitos de seguridad
        return mayusculas > 2 && minusculas > 1 && numeros > 5;
    }

    // Método para generar la contraseña aleatoria
    public void generarPassword() {
        StringBuilder sb = new StringBuilder(); // Utiliza un StringBuilder para construir la contraseña
        Random random = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // Genera caracteres aleatorios hasta alcanzar la longitud deseada
        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            sb.append(caracteres.charAt(index));
        }

        contraseña = sb.toString(); // Asigna la contraseña generada al atributo correspondiente
    }

    // Métodos get y set
    public String getContraseña() {
        return contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}
