package ejemplopolimorfismo;

public class Gerente extends Empleado{
    //Atributos
    private String departamento;
    
    //Constructor
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    //Sobreescribimos el metodo padre heredado
    public String obtenerDetalles(){
        //Observamos que para no repetir codigo, podemos utilizar
        //el metodo del padre y solo agregar a este metodo lo de la clase hija,
        //esto es invocar un metodo sobreescrito
        return super.obtenerDetalles() + ", departamento: " + departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
