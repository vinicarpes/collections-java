package comparableXcomparator;

import java.util.Comparator;

public class ComparaTitulo implements Comparator<Livro>{
    public int compare(Livro l1, Livro l2){
        return l1.getTitulo().compareTo(l2.getTitulo());
    }
}
