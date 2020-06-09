package encapsulamiento;

public class Encapsulamiento {

    public static void main(String[] args) {
        //Creamos el objeto
        Persona p1 = new Persona("Juan", "Perez", false);
        //Accedemos al atributo nombre
        System.out.println("Nombre de p1: " + p1.getNombre());
        
        //Creamos otro objeto
        Persona p2 = new Persona("Karla", "Gonzalez", false);
        //Imprimimos el estado completo del objeto
        System.out.println("Estado del objeto p2: " + p2);
        
        //Marcamos como eliminada a la persona
        p2.setBorrado(true);
        //Imprimimos el estado completo del objeto
        System.out.println("Estado del objeto p2: " + p2);
        
        //Creamos un 3er objeto vacio
        Persona p3 = new Persona();
        //Imprimimos el estado completo del objeto
        System.out.println("Estado del objeto p3: " + p3);
        
    }
    
}
