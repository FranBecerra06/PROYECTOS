package gestionEventoDeportivo;

public class Participante {

    // Atributos privados del participante
    private String nombre;
    private String apellido;
    private int edad;
    private double tiempo;

    // Constructor de la clase Participante
    public Participante(String nombre, String apellido, int edad, double tiempo) throws ParticipanteNoValidoException {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tiempo = tiempo;

        // Validación del nombre y apellido: no pueden ser nulos
        if (nombre == null || apellido == null) {
            throw new ParticipanteNoValidoException("El nombre y apellido no puede ser nulo.");
        }

        // Validación de la edad: el participante no puede ser menor de 14 años
        if (edad < 14) {
            throw new ParticipanteNoValidoException("El participante no puede ser menor a 14.");
        }
    }

    // Métodos getter y setter para el nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getter y setter para el apellido
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Métodos getter y setter para la edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método toString para obtener la representación del objeto en forma de cadena
    public String toString() {
        return "Participante nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad;
    }

    // Métodos getter y setter para el tiempo
    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
}
