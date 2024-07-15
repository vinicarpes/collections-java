package mapInterface.opBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos(){
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, int numero){
        agendaContatoMap.put(nome, numero);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public String pesquisarNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return "Número de "+ nome + " é [" + numeroPorNome + "]";
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Vini", 48);
        agendaContatos.adicionarContato("Pai", 49);
        agendaContatos.adicionarContato("Mae", 47);
        agendaContatos.adicionarContato("Bruna", 46);
        agendaContatos.adicionarContato("Pai", 50);
        
        agendaContatos.exibirContatos();
        
        agendaContatos.removerContato("Pai");
        
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarNome("Pai"));
    }
}
