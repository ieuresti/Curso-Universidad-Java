package manejopersonas;

import datos.*;
import domain.Persona;
import java.util.List;

public class ManejoPersonas {

    public static void main(String[] args) {
        
        PersonasJDBC personasjdbc = new PersonasJDBC();
        //Prueba del metodo INSERT
        //personasjdbc.insert("Alberto", "Lopez");
        
        //Prueba del metodo UPDATE
        //personasjdbc.update(2, "Nombre2", "Apellido2");
        
        //Prueba del metodo DELETE
        //personasjdbc.delete(2);
        
        //Prueba del metodo SELECT
        //Uso de un objeto persona para encapsular la informacion de un registro de base de datos
        List<Persona> personas = personasjdbc.select();
        for (Persona persona : personas) {
            System.out.println(persona);
            System.out.println("");
        }
    }
    
}
