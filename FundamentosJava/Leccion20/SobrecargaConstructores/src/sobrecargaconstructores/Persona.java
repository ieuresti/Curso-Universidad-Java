package sobrecargaconstructores;

public class Persona {
    //Atributos
    private int idPersona;
    private String nombre;
    private int edad;
    private static int contadorPersonas;
    
    //Constructor sin argumentos y privado
    //Asigna el idPersona
    private Persona(){ //No se podra heredar, solo se puede utilizar en esta clase
        this.idPersona = ++contadorPersonas;
    }
    
    //Constructor sobrecargado
    public Persona(String nombre, int edad){
        //Se manda a llamar el constructor vacio para que se asigne el idPersona
        this();
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Metodos
    @Override
    public String toString(){
        return "Persona{" + "idPersona=" + idPersona + ", nombre= " + nombre + ", edad=" + edad + '}';
    }
    
}
