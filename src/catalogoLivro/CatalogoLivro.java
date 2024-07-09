package catalogoLivro;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {
    //atributo
    private List<Livro> livrosList;

    public CatalogoLivro() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano){
        livrosList.add(new Livro(ano, titulo, autor));
    }

    public List<Livro> pesquisarAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarAno(int anoInicial, int anoFinal){
        List<Livro> livrosPorAno = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livro l: livrosList){
                if(l.getAno()>=anoInicial && l.getAno()<=anoFinal){
                    livrosPorAno.add(l);
                }
            }
        }
        return livrosPorAno;
    }
    
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivro catalogoLivro = new CatalogoLivro();
        catalogoLivro.adicionarLivro("Livro 1", "Autor 1", 2021);
        catalogoLivro.adicionarLivro("Livro 2", "Autor 1", 2019);
        catalogoLivro.adicionarLivro("Livro 3", "Autor 2", 2019);
        catalogoLivro.adicionarLivro("Livro 4", "Autor 3", 2018);
        catalogoLivro.adicionarLivro("Livro 1", "Autor 4", 2020);
    
        // System.out.println(catalogoLivro.pesquisarAutor("Autor 1"));
        // System.out.println(catalogoLivro.pesquisarAno(2017, 2018));
        System.out.println(catalogoLivro.pesquisarPorTitulo("Livro 1"));
    }
}
