package ventas;

import com.gm.ventas.*;

public class Ventas {

    public static void main(String[] args) {
        //Creamos varios objetos Producto
        Producto p1 = new Producto("Camisa", 50.00);
        Producto p2 = new Producto("Pantalon", 100.00);
        Producto p3 = new Producto("Corbata", 30.00);
        
        //Creamos un objeto Orden
        Orden orden1 = new Orden();
        
        //Agregamos los productos a la orden
        orden1.agregarProducto(p1);
        orden1.agregarProducto(p2);
        orden1.agregarProducto(p3);
        
        //Imprimimos la orden
        orden1.mostrarOrden();
        
        //Creamos una segunda orden
        Orden orden2 = new Orden();
        
        //Creamos nuevos productos
        Producto p4 = new Producto("Zapatos", 200.00);
        Producto p5 = new Producto("Blusa", 90.00);
        
        //Agregamos productos a la orden 2
        orden2.agregarProducto(p1);
        orden2.agregarProducto(p4);
        orden2.agregarProducto(p5);
        orden2.agregarProducto(p3);
        
        //Imprimimos la orden 2
        System.out.println("");
        orden2.mostrarOrden();
    }
    
}
