package set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidade {
    private Set<Convidado>convidadoSet;

    public ConjuntoConvidade(Set<Convidado> convidadoSet) {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidadoNoSet(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadeParaRemover = null;
        for(Convidado c: convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadeParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadeParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }


public static void main(String[] args){
    ConjuntoConvidade conjuntoConvidade = new ConjuntoConvidade(null);
    System.out.println("Existem " + conjuntoConvidade.contarConvidados() + " convidados");
    
    conjuntoConvidade.adicionarConvidadoNoSet("Convidado 1", 1);
    conjuntoConvidade.adicionarConvidadoNoSet("Convidado 3", 3);
    conjuntoConvidade.adicionarConvidadoNoSet("Convidado 2", 2);
    conjuntoConvidade.adicionarConvidadoNoSet("Convidado 4", 4);
    conjuntoConvidade.adicionarConvidadoNoSet("Convidado 5", 4);
    conjuntoConvidade.adicionarConvidadoNoSet("Convidado 5", 7);

    conjuntoConvidade.exibirConvidados();
    System.out.println("Existem " + conjuntoConvidade.contarConvidados() + " convidados");
    
    conjuntoConvidade.removerConvidadoPorCodigoConvite(4);
    
    conjuntoConvidade.exibirConvidados();
}
}