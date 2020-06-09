package manejopersonas;

import datos.*;
import java.sql.*;

public class ManejoPersonas {

    public static void main(String[] args) {
        
        PersonasJDBC personasjdbc = new PersonasJDBC();
        
        //Creamos un objeto conexion, se va a compartir para todos los queries que ejecutemos
        Connection conn = null;
        
        try {
            conn = Conexion.getConnetcion();
            //Revisamos si la conexion esta en modo autocommit
            //por default es autocommit == true
            if (conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }
            //Creamos el objeto PersonasJDBC y proporcionamos la conexion creada
            PersonasJDBC personas = new PersonasJDBC(conn);
            //Empezamos a ejecutar sentencias
            //Recordar que una transaccion agrupa varias sentencias SQL, si algo falla no se realizan los cambios en la BD
            //Cambio correcto
            personas.update(5, "Regreso5", "Regreso");
            
            //Provocamos un error superando los 45 caracteres del campo apellido
            personas.insert("Miguel", "Gonzalez");
            
            //El concepto de transacciones es: "SE EJECUTAN TODAS LAS OPERACIONES DE NUESTRO BLOQUE O NINGUNO"
            
            //Guardamos los cambios
            conn.commit();
        } catch (SQLException e) {
            //Hacemos un rollback en caso de error
            try {
                System.out.println("Entramos al rollback");
                //Imprimimos la excepcion a la consola
                e.printStackTrace();
                //Hacemos el rollback
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace(System.out);
            }
        }
    }
    
}
