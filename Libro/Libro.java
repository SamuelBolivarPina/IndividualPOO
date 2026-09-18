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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}