package comparableXcomparator;


public class Livro implements Comparable<Livro> { //fornece uma maneira de como voce quer ordenar
 private String titulo;
 private String autor;
 private int ano;

    public Livro(String li, String au, int an){
        this.ano = an;
        this.autor = au;
        this.titulo = li;
    }

    public int compareTo(Livro l){
        return titulo.compareTo(l.titulo);
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAno(){
        return ano;
    }
}



