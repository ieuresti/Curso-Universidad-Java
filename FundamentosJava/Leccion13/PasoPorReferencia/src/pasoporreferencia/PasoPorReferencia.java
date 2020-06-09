package pasoporreferencia;

public class PasoPorReferencia {

    public static void main(String[] args) {
        // TODO code application logic here
        Persona p = new Persona();
        p.cambiarNombre("Juan");
        imprimirNombre(p); //Imprime Juan
        modificarPersona(p);
        imprimirNombre(p); //Imprime Carlos      
    }
    
    public static void modificarPersona(Persona arg){
        arg.cambiarNombre("Carlos");
    }
    
    public static void imprimirNombre(Persona p){
        System.out.println("Valor recibido: " + p.obtenerNombre());
    }
    
}
