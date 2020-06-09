package beans;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase para generar un JavaBean de la lista de rectangulos
 * y que se pueda usar con jsp:useBean
 * @author Ivan
 */

public class ListaRectangulos {
    //Atributo que almacenara los objetos rectangulos
    private List<Rectangulo> lista = new ArrayList<>();
    
    /**
     * Este metodo nos permite simular una propiedad llamada
     * "rectangulo" desde la accion jsp:setProperty en un JSP
     * @param r
     */
    public void setRectangulo(Rectangulo r) {
        this.lista.add(r);
    }
    
    public List<Rectangulo> getLista() {
        return lista;
    }

    public void setLista(List<Rectangulo> lista) {
        this.lista = lista;
    }
}
