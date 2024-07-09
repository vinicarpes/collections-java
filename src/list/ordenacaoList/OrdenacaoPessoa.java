package list.ordenacaoList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }


    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordernarIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordernarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }
    
    public static void main(String[] args){
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
    ordenacaoPessoa.adicionarPessoa("nome 1", 20, 1.90);
    ordenacaoPessoa.adicionarPessoa("nome 2", 21, 1.67);
    ordenacaoPessoa.adicionarPessoa("nome 3", 13, 1.55);
    ordenacaoPessoa.adicionarPessoa("nome 4", 24, 1.40);

    // System.out.println(ordenacaoPessoa.ordernarIdade());
    System.out.println(ordenacaoPessoa.ordernarPorAltura());
}
}