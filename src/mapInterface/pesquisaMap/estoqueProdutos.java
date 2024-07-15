package mapInterface.pesquisaMap;

import java.util.HashMap;
import java.util.Map;

public class estoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public estoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, int quantidade, float valor){
        estoqueProdutosMap.put(codigo, new Produto(codigo, quantidade, nome, valor));
    }
    
    public void exbibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calculaValorTotal(){
        double valorTotalEstoque=0;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade()*p.getValor();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaiCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p: estoqueProdutosMap.values()){
                if(p.getValor()>maiorPreco){
                    produtoMaiCaro=p;
                    maiorPreco = p.getValor();
                }
            }
        }
        return produtoMaiCaro;
    }

    public static void main(String[] args) {
        estoqueProdutos estoque = new estoqueProdutos();

        estoque.exbibirProdutos();
        
        estoque.adicionarProduto(97, "Produto1", 12, 27);
        estoque.adicionarProduto(45, "Produto2", 9, 4);
        estoque.adicionarProduto(265, "Produto3", 15, 800);
        estoque.adicionarProduto(421, "Produto4", 1, 458);
        
        estoque.exbibirProdutos();

        System.out.println(estoque.calculaValorTotal());

        System.out.println(estoque.obterProdutoMaisCaro());
    }
}
