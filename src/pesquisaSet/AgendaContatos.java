package pesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }    

    public void adicionarContato(String nome, int telefone){
        contatoSet.add(new Contato(nome, telefone));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c: contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c: contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();
        
        agendaContatos.adicionarContato("claudio", 12);
        agendaContatos.adicionarContato("rudinei", 2);
        agendaContatos.adicionarContato("carlim", 15);
        agendaContatos.adicionarContato("maria", 21);
        agendaContatos.adicionarContato("jessica", 20);
        agendaContatos.adicionarContato("jessica", 15);
        
        // agendaContatos.exibirContato();
        
        agendaContatos.atualizarContato("jessica", 12);
        // agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("maria"));
    }
}
