package mapInterface.ordenacaoMap;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos(){
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirEventos(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }
    
    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        
        for(Map.Entry<LocalDate, Evento> entry: eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual)|| entry.getKey().isAfter(dataAtual)){
                System.out.println("O próximo evento: " + entry.getValue() + " será na data " + entry.getKey());
               break;
            }
        }       
    }
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        
        // agendaEventos.adicionarEvento(LocalDate.of(2024, 7, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 7, 16), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022,4, 5), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 1, 1), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 5, 17), "Evento 4", "Atração 4");
        
        // agendaEventos.exibirEventos();

        agendaEventos.obterProximoEvento();
    }
}
