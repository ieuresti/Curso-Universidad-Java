package encapsulamiento;

public class Persona {
    
    //Constructor vacio
    public Persona(){}
    
    //Constructor con 3 argumentos
    public Persona(String nombre, String apellido, boolean borrado){
        this.nombre = nombre;
        this.apellido = apellido;
        this.borrado = borrado;
    }
    
    //Atributos privados (estos pueden ir antes o despues de los metodos)
    private String nombre;
    private String apellido;
    private boolean borrado;
    
    //Metodos publicos para acceder y/o modificar los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }
    
    //Metodo que imprime el estado del objeto
    @Override
    public String toString(){
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", borrado=" + borrado + '}';
    }
}
