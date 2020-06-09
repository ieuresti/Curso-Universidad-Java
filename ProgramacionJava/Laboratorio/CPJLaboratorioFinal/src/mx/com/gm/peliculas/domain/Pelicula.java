package mx.com.gm.peliculas.domain;

public class Pelicula {
    //Atributos
    private String nombre;
    
    //Constructores
    public Pelicula(){}
    
    public Pelicula(String nombre){
        this.nombre = nombre;
    }
    
    //Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return this.nombre;
    } 
}
