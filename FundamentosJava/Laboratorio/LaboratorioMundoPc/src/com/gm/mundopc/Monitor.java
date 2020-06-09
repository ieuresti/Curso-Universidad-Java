package com.gm.mundopc;

public class Monitor {
    //Atributos
    private final int idMonitor;
    private String marca;
    private double tamaño;
    private static int contadorMonitores;
    
    //Constructores
    private Monitor(){
        idMonitor = ++contadorMonitores;
    }
    
    public Monitor(String marca, double tamaño){
        this();
        this.marca = marca;
        this.tamaño = tamaño;
    }
    
    //Metodos
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }
    
    //Metodo que concatena las variables y regresa una cadena    
    @Override
    public String toString(){
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamaño=" + tamaño + '}';
    }
    
}
