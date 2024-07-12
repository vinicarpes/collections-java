package ordenacaoSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(int cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(nome, cod, quantidade, preco));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtorPorNome = new TreeSet<>(produtoSet);
        return produtorPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        
        cadastroProdutos.adicionarProduto(1, "Cachos Match", 49.90, 10);
        cadastroProdutos.adicionarProduto(2, "Arbo", 9.90, 40);
        cadastroProdutos.adicionarProduto(3, "Essencial Único", 290.99, 15);
        
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
