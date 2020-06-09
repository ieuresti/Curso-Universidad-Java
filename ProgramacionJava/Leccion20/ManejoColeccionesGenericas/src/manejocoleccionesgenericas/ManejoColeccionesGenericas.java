package manejocoleccionesgenericas;

import java.util.*;

public class ManejoColeccionesGenericas {

    public static void main(String[] args) {
        // TODO code application logic here
        List<String> miLista = new ArrayList<>();
        miLista.add("1");
        miLista.add("2");
        miLista.add("3");
        miLista.add("4");
        miLista.add("4");
        imprimir(miLista);
        
        Set<String> miSet = new HashSet<>();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        miSet.add("300");
        imprimir(miSet);
        
        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("1", "Juan");
        miMapa.put("2", "Carlos");
        miMapa.put("3", "Rosario");
        miMapa.put("4", "Esperanza");
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }
    
    static void imprimir(Collection<String> collection){
        for (String elemento : collection) {
            System.out.println(elemento + " ");
        }
        System.out.println();
    }
    
}
