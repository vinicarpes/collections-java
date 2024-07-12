package ordenacaoSet;

import java.util.Comparator;

public class Produto implements Comparable<Produto>, Comparator<Produto>{
    private String nome;
    private int cod;
    private int quantidade;
    private double preco;
    
    public Produto(String nome, int cod, int quantidade, double preco) {
        this.nome = nome;
        this.cod = cod;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getCod() {
        return cod;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + cod;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (cod != other.cod)
            return false;
        return true;
    }

    
    
    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", cod=" + cod + ", quantidade=" + quantidade + ", preco=" + preco + "]";
    }
    
    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.compare(o1, o2);
    }
    
    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }
}

class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
    
}