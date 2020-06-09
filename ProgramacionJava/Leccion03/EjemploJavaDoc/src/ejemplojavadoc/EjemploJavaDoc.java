package ejemplojavadoc;

import com.gm.javadoc.Aritmetica;

/**
 * Clase para probar el concepto de JavaDoc
 * @author Ivan
 * @version 1.0
 */
public class EjemploJavaDoc {

    /**
     * Metodo que ejecuta la prueba de la clase Aritmetica
     * @param args argumentos de la linea de comando 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resultado = new Aritmetica(3, 2).sumar();
        
        System.out.println("resultado: " + resultado);
    }
    
}
