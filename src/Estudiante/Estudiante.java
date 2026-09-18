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
}