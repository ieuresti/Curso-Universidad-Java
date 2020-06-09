package com.gm.mundopc;

public class Orden {
    //Atributos
    private final int idOrden;
    private final Computadora computadoras[]; //Declaracion del arreglo de computadoras
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private final static int maxComputadoras = 5; //Definimos el maximo de elementos del arreglo
    
    //Constructor
    public Orden(){
        this.idOrden = ++contadorOrdenes;
        //Se instancia el arreglo de computadoras
        computadoras = new Computadora[maxComputadoras];
    }
    
    public void agregarComputadora(Computadora computadora){
        //Si las computadoras agregadas no superan el maxComputadoras, agregamos la nueva computadora
        if (contadorComputadoras < maxComputadoras) {
            //Agregamos la nueva computadora al arreglo e incrementamos el contador de computadoras
            computadoras[contadorComputadoras++] = computadora;
        } else {
            System.out.println("Se ha superado el maximo de productos: " + maxComputadoras);
        }
    }
    
    public void mostrarOrden(){
        System.out.println("Orden #" + idOrden);
        System.out.println("Computadoras de la orden #" + idOrden + ":");
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(computadoras[i]);
        }
    }
    
}
