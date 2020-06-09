package bloquescodigo;

public class Persona {
    
    private final int idPersona;
    private static int contadorPersonas;
    
    //Bloque de inicializacion estatico
    static {
        //Iniciamos el idPersonas desde el valor 10
        contadorPersonas = 10;
        //Aqui no se pueden usar variables NO estaticas
        //idPersona = 1;
        System.out.println("Ejecuta bloque estatico");
    }
    
    //Bloque de codigo para inicializar atributos de la clase
    //El bloque se copia a cada constructor de la clase
    {
        System.out.println("Ejecuta bloque inicializador");
        idPersona = ++contadorPersonas;
    }
    
    Persona(){
        System.out.println("Ejecuta constructor");
    }
    
    public int getIdPersona(){
        return idPersona;
    }
    
}
