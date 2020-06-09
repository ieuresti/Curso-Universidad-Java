package manejocolecciones;

import java.util.*;

public class ManejoColecciones {

    public static void main(String[] args) {
        //Variable miLista es de tipo List(es una interface)
        List miLista = new ArrayList();
        miLista.add("1"); //Este argumento sera de tipo Object(default) ya que no se ha especificado el tipo de dato
        miLista.add("2");
        miLista.add("3");
        miLista.add("4");
        //Elemento repetido
        miLista.add("4");
        imprimir(miLista);
        
        //Interface set
        Set miSet = new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        //No permite elementos repetidos, lo ignora
        miSet.add("300");
        imprimir(miSet);
        
        //Interface map
        Map miMapa = new HashMap();
        //Sigue la forma llave, valor
        miMapa.put("1", "Juan");
        miMapa.put("2", "Carlos");
        miMapa.put("3", "Rosario");
        miMapa.put("4", "Esperanza");
        //Se imprimen todas las llaves
        imprimir(miMapa.keySet());
        //Se imprimen todos los valores
        imprimir(miMapa.values());
    }
    
    private static void imprimir(Collection collection){
        for (Object elemento : collection) {
            System.out.println(elemento + " ");
        }
        System.out.println("");
    }
    
}
