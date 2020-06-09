package introduccionjdbc;

import java.sql.*;

public class IntroduccionJDBC {

    public static void main(String[] args) {
        //Cadena de conexion de MySql, el parametro useSSL es opcional
        String url = "jdbc:mysql://localhost:3306/sga?useSSL=false"; //base de datos a usar, ip:puerto, esquema o bd
        //Cargamos el driver de MySql
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Creamos el objeto de conexion
            Connection conexion = DriverManager.getConnection(url, "root", "admin");
            //Creamos un objeto Statement
            Statement instruccion = conexion.createStatement();
            //Creamos el query
            String sql = "select id_persona, nombre, apellido from persona";
            //Ejecutar el query
            ResultSet result = instruccion.executeQuery(sql);
            //Procesando el query
            while (result.next()) {
                System.out.print("Id: " + result.getInt(1));
                System.out.print(" Nombre: " + result.getString(2));
                System.out.println(" Apellido: " + result.getString(3));
            }
            //Cerrar cada uno de los objetos utilizados
            result.close();
            instruccion.close();
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    } 
}
