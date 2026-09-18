public class Libro {
    // Atributos de la clase
    public String titulo;
    public String autor;
    public int numeroPaginas;

    // 1. Constructor por defecto (asigna valores predeterminados)
    public Libro() {
        this.titulo = "Sin título";
        this.autor = "Autor desconocido";
        this.numeroPaginas = 0;
    }

    // 2. Constructor parametrizado (asigna valores específicos)
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
}