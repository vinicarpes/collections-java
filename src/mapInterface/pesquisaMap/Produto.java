package mapInterface.pesquisaMap;

public class Produto {
    private long codigo;
    private int quantidade;
    private String nome;
    private float valor;
    
    public Produto(long codigo, int quantidade, String nome, float valor) {
        this.quantidade = quantidade;
        this.nome = nome;
        this.valor = valor;
        this.codigo = codigo;
    }

    public long getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }

    public float getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", quantidade=" + quantidade + ", nome=" + nome + ", valor=" + valor + "]";
    }
}
