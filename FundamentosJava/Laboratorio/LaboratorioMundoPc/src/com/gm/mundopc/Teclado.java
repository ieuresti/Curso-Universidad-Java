package com.gm.mundopc;

public class Teclado extends DispositivoEntrada{
    //Atributos
    private final int idTeclado;
    private static int contadorTeclados;

    //Constructor que inicializa las variables
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        idTeclado = ++contadorTeclados;
    }
    
    //Metodos
    @Override
    public String toString(){
        return "Teclado{" + "idTeclado=" + idTeclado + ", " + super.toString();
    }
    
}
