package datos;

public interface AccesoDatos {
    //Constantes
    //Siempre van en mayusculas
    public static int MAX_REGISTROS = 10;
    
    //Metodos
    public abstract void insertar();
    
    public abstract void listar();
}
