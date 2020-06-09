package ejemploherencia;

public class Persona { //Definicion de la clase Padre
    //Atributos
    private String nombre;
    private char genero;
    private int edad;
    private String direccion;
    
    //Constructor vacio
    public Persona(){}
    
    //Constructor 1 argumento
    public Persona(String nombre){
        this.nombre = nombre;
    }
    
    //Constructor completo
    public Persona (String nombre, char genero, int edad, String direccion){
        this.nombre = nombre;
        this.genero = genero; //M-Masculino, F-Femenino
        this.edad = edad;
        this.direccion = direccion;
    }
    
    //Metodos (getters y setters)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString(){
        return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direccion=" + direccion + '}';
    }
}
