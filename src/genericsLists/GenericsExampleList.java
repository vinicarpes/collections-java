package genericsLists;

import java.util.ArrayList;
import java.util.List;

public class GenericsExampleList {
    public static void main(String[] args) {
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10); 

        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("10");
        listaGenerics.add("11");

        for(Object elemento : listaSemGenerics){
            System.out.println(elemento);
        }

        for(String elemento : listaGenerics){
            String str = (String) elemento;
            System.out.println(str);
        }

    }
}
