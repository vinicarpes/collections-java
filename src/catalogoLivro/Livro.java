package catalogoLivro;

public class Livro {
    private int ano;
    private String titulo;
    private String autor;
    
    public Livro(int ano, String titulo, String autor) {
        this.ano = ano;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Livro [ano=" + ano + ", titulo=" + titulo + ", autor=" + autor + "]";
    }


    
}
