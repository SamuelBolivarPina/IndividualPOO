package Estudiante;

public class Estudiante {
    public String nombre;
    public int edad;
    public String curso;

    // 1. Constructor por defecto que asigne valores genéricos (llama al constructor parametrizado)
    public Estudiante() {
        this("Sin nombre", 0, "Sin curso");
    }

    // 2. Constructor que acepta como parámetros el nombre y la edad
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "No asignado"; // Valor por defecto para el curso
    }

    // 3. Constructor que acepta todos los parámetros y utiliza this() para llamar al constructor de 2 parámetros
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad); // Reutiliza la asignación de nombre y edad
        this.curso = curso;  // Asigna el atributo restante
    }
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}