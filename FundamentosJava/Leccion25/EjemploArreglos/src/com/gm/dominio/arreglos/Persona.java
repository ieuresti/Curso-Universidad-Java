package com.gm.dominio.arreglos;

public class Persona {
    //Atributos
    private String nombre;
    
    //Constructor
    public Persona(String nombre){
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
        return "Persona{" + "nombre=" + getNombre() + '}';
    }
    
}
