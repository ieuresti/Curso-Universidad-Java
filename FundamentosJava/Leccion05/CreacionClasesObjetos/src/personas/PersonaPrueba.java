package personas;

public class PersonaPrueba {
    
    public static void main(String[] args) {
        //Creacion de un objeto
        Persona p1 = new Persona();
        
        //Llamando a un metodo del objeto creado
        System.out.println("Valores por default del objeto Persona");
        p1.desplegarNombre();
        
        //Modificar valores
        p1.nombre = "Juan";
        p1.apellidoPaterno = "Esparza";
        p1.apellidoMaterno = "Lara";
        
        //Volvemos a llamar al metodo
        System.out.println("\nNuevos valores del objeto Persona");
        p1.desplegarNombre();
        
        //Creacion de un 2do objeto y asignacion de valores diferentes
        Persona p2 = new Persona();
        p2.nombre = "Ivan";
        p2.apellidoPaterno = "Uresti";
        p2.apellidoMaterno = "Fuantos";
        
        //Llamamos al metodo y mostramos resultados
        System.out.println("\nValores de nuestros objetos p1 y p2");
        p1.desplegarNombre();
        p2.desplegarNombre();
    }
    
}
