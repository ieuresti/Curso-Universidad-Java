package ejemplostatic;

public class Persona {
    //Atributos
    private String nombre;
    private int idPersona;
    private static int contadorPersonas;
    
    //Constructores
    public Persona(String nombre){
        //Cada que creamos un objeto persona incrementamos el contador para obtener un nuevo idPersona
        contadorPersonas++;
        //Asignamos el nuevo valor al idPersona
        idPersona = contadorPersonas;
        //Asignamos el nombre recibido
        this.nombre = nombre;
    }
    
    //Metodos
    @Override
    public String toString(){
        return "Persona[idPersona: " + idPersona + ", nombre: " + nombre + "]"; 
    }
    
    public static int getContadorPersonas(){
        return contadorPersonas;
    }
        
}
