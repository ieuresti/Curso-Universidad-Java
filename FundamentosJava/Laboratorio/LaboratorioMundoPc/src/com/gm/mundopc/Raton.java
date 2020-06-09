package com.gm.mundopc;

public class Raton extends DispositivoEntrada{
    //Atributos
    private final int idRaton;
    private static int contadorRatones;
    
    //Constructor que inicializa las variables
    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        idRaton = ++contadorRatones;
    }
    
    //Metodos
    @Override
    public String toString(){
        return "Raton{" + "idRaton=" + idRaton + ", " + super.toString();
    }
}
