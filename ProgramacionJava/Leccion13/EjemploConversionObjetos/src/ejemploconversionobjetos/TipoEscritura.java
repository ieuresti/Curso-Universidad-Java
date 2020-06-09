package ejemploconversionobjetos;

public enum TipoEscritura {
    
    CLASICO("Escritura a mano"),
    MODERNO("Escritura digital");
    
    //Atributos
    private final String descripcion;
    
    //Constructor
    private TipoEscritura(String descripcion){
        this.descripcion = descripcion;
    }
    
    //Metodos
    public String getDescripcion(){
        return descripcion;
    }
    
}
