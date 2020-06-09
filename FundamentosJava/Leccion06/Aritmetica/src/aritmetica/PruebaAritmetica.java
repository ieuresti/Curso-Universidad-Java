package aritmetica;

public class PruebaAritmetica {
    
    public static void main(String[] args) {
        
        //Creamos un objeto de la clase Aritmetica
        Aritmetica a = new Aritmetica();
        
        //Llamamos el metodo sumar y recibimos el valor devuelto
        int resultado = a.sumar(5, 3);
        
        System.out.println("Resultado: " + resultado);
    }
    
}
