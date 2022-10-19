public class Livro {
    private int codigo, anoPublicação;
    private String titulo, autor;

    public Livro(int codigo, int anoPublicação, String titulo, String autor) {
        this.codigo = codigo;
        this.anoPublicação = anoPublicação;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getAnoPublicação() {
        return anoPublicação;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    
}
