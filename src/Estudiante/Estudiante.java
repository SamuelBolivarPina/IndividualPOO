package Estudiante;

public class Estudiante {
    public String nombre;
    public int edad;
    public String curso;

    // 1. Constructor por defecto que asigne valores genéricos (llama al constructor parametrizado)
    public Estudiante() {
        this("Sin nombre", 0, "Sin curso");
    }
}