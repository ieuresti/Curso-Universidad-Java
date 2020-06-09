package manejointerfaces;

import datos.*;

public class ManejoInterfaces {

    public static void main(String[] args) {
        //Variable de tipo interface apuntando/referenciando a un objeto que ha implementado dicha interface
        AccesoDatos datos = new ImplementacionOracle();
        ejecutar(datos, "listar");
        
        datos = new ImplementacionMySql();
        ejecutar(datos, "insertar");
    }
    
    private static void ejecutar(AccesoDatos datos, String accion){
        if ("listar".equals(accion)) {
            datos.listar();
        }
        else if ("insertar".equals(accion)) {
            datos.insertar();
        }
    }
    
}
