package com.gm.ventas;

public class Orden {
    //Atributos
    private final int idOrden;
    private final Producto productos[]; 
    private static int contadorOrdenes;
    private int contadorProductos; //Para contabilizar el # de productos que se ha agregado al arreglo
    private final static int maxProductos = 10;
    
    //Constructor
    public Orden(){
        this.idOrden = ++contadorOrdenes; //Cada vez que se crea un objeto de tipo orden se genera un nuevo id
        productos = new Producto[maxProductos]; //Instanciando el arreglo de productos
    }
    
    //Metodos
    public void agregarProducto(Producto producto){ //Recibe como arg un objeto de tipo producto
        //Si los productos agregados no superan al maximo de productos, agregamos el nuevo producto
        if (contadorProductos < maxProductos) {
            //Agregamos el nuevo producto al arreglo e incrementamos el contador de productos
            productos[contadorProductos++] = producto;
        } else{
            System.out.println("Se ha superado el maximo de productos: " + maxProductos);
        }
    }
    
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < contadorProductos; i++) {
            total += productos[i].getPrecio();
        }
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("Orden #:" + idOrden);
        System.out.println("Total de la orden #" + idOrden + ": $" + calcularTotal());
        System.out.println("Productos de la orden #" + idOrden + ":");
        for (int i = 0; i < contadorProductos; i++) {
            System.out.println(productos[i]);
        }
    }
    
}
