package foreach;

public class Persona {
    //Atributos
    private final int idPersona;
    private String nombre;
    private static int contadorPersonas;
    
    //Constructor
    Persona(String nombre){
        idPersona = ++contadorPersonas;
        this.nombre = nombre;
    }
    
    //Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
