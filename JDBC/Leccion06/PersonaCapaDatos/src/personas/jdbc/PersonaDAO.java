package personas.jdbc;

import java.sql.SQLException;
import java.util.List;
import personas.dto.PersonaDTO;

/**
 * Esta interfaz contiene los metodos abstractos con las operaciones basicas
 * sobre la tabla de Persona CRUD (Create, Read, Update y Delete)
 * Se debe crear una clase concreta para implementar el codigo asociado a cada metodo
 * @author Ivan
 */
public interface PersonaDAO {
    
    public int insert(PersonaDTO persona) throws SQLException;
    
    public int update(PersonaDTO persona) throws SQLException;
    
    public int delete(PersonaDTO persona) throws SQLException;
    
    public List<PersonaDTO> select() throws SQLException;
    
}
