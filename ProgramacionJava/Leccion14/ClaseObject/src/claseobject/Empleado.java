package claseobject;

public class Empleado {
    //Atributos
    private String nombre;
    private double sueldo;
    
    //Constructor
    Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    //Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    //Con este metodo tenemos la oportunidad de mostar una cadena con el estado(valores actuales de cada atributo de la clase) de nuestro objeto
    //Si no se sobreescribe este metodo se imprimira en consola la referencia en memoria en donde se ubica el objeto actual
    @Override
    public String toString(){
        return "Empleado{" + "nombre: " + nombre + ", sueldo: " + sueldo + '}';
    }
    
    //Se utiliza para saber si 2 objetos son iguales
    //Si no se sobreescribe comparara la ubicacion de memoria de los objetos en lugar del contenido de los objetos
    @Override
    public boolean equals(Object obj){
        if (obj == null) { //Comparamos si el obj que recibimos es = a null
            return false;
        }
        if (obj instanceof Empleado) { //Si es != de null comparamos si el arg que estamos recibiendo es del tipo Empleado
            Empleado emp = (Empleado) obj; //Si es true hacemos una conversion de objetos para obtener los atr o metodos de la clase Empleado del objeto que estamos recibiendo
            if (nombre.equals(emp.nombre) && Double.valueOf(sueldo).equals(emp.sueldo)) { //Comparamos los atr de nuestro objeto actual si es = en contenido al atr nombre o sueldo que estamos recibiendo
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
    //Devuelve un entero diferente unico para cada objeto
    @Override
    public int hashCode(){
       int hash = 7;
       hash = 31 * hash + this.nombre.hashCode();
       hash = 31 * hash + Double.valueOf(this.sueldo).hashCode();
       return hash;
    }
    
}
