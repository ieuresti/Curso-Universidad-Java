package ejemploherencia;

public class Empleado extends Persona{
    //Atributos
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados;
    
    //Constructor
    public Empleado(String nombre, double sueldo){
        super(nombre); //Super debe ser la 1ra linea
        this.idEmpleado = ++contadorEmpleados;
        this.sueldo = sueldo;
    }
    
    //Metodos
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public String toString(){
        //Primero mandamos a llamar el metodo toString de la clase Persona
        //para que podamos observar los valores de la clase Padre,
        //y despues imprimimos los valores de la clase hija
        return super.toString() + " Empleado{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + '}';
    }
    
    
}
