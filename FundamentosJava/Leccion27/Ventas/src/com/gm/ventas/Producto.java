package com.gm.ventas;

public class Producto {
    //Atributos
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    //Constructor vacio
    private Producto() {
        //Asignamos el idProducto unico por cada objeto creado
        this.idProducto = ++contadorProductos;
    }

    //Constructor sobrecargado de dos argumentos
    public Producto(String nombre, double precio) {
        //Llamamos al constructor vacio para asignar el idProducto
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    //Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString(){
        return "Producto{" + "idProducto #" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }

}
