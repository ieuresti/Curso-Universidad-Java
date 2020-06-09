package ejemploconversionobjetos;

public class Escritor extends Empleado{
    //Utilizamos una enumeracion para las operaciones de tipo escritura
    final TipoEscritura tipoEscritura;
    
    //Constructor
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    
    //Metodos
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", tipoEscritura: " + tipoEscritura.getDescripcion();
    }

    public TipoEscritura getTipoEscritura(){
        return tipoEscritura;
    }
    
    public String getTipoDeEscrituraEnTexto(){
        return tipoEscritura.getDescripcion();
    }
}
