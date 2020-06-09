package personas.test;

import java.sql.SQLException;
import java.util.List;
import personas.dto.PersonaDTO;
import personas.jdbc.PersonaDAO;
import personas.jdbc.PersonaDaoJDBC;

public class TestPersonas {

    public static void main(String[] args) {
        //Utilizamos el tipo interface como referencia a una clase concreta
        PersonaDAO personaDao = new PersonaDaoJDBC();
        
        //Creamos un nuevo registro
        //Hacemos uso de la clase persona DTO la cual se usa para transferir la informacion entre las capas,
        //no es necesario especificar la llave primaria ya que en este caso es de tipo AI y la BD se encarga de asignarle un nuevo valor
        PersonaDTO persona = new PersonaDTO();
        persona.setNombre("Mario");
        persona.setApellido("Lopez");
        //Utilizamos la capa DAO para persistir el objeto DTO
        try {
            personaDao.insert(persona);
            
            //Eliminamos un registro, el id 3
            //personaDao.delete(new PersonaDTO(3));
            
            //Actualizamos un registro
            PersonaDTO personaTmp = new PersonaDTO();
            personaTmp.setId_persona(5); //Actualizamos el registro 5
            personaTmp.setNombre("Yoko");
            personaTmp.setApellido("Hikasa");
            personaDao.update(personaTmp);
            
            //Seleccionamos todos los registros
            List<PersonaDTO> personas = personaDao.select();
            for (PersonaDTO personaDTO : personas) {
                System.out.print(personaDTO);
                System.out.println();
            }
        } catch (SQLException e) {
            System.out.println("Excepcion en la capa de prueba");
            e.printStackTrace();
        }
    }
    
}
