package sobrecargaconstructores;

public class SobrecargaConstructores {

    public static void main(String[] args) {
        //El constructor vacio es privado, por lo que nos obliga a utilizar
        //el unico constructor publico y por lo tanto
        //proporcionar valores en los campos de nombre y edad
        
        //Persona p1 = new Persona(); -> Marcaria error ya que solo funciona en la clase Persona y no en SobrecargaConstructores
        Persona p1 = new Persona("Lilia", 22);
        System.out.println("Imprimimos el objeto p1");
        System.out.println(p1);
        
        //Creamos un nuevo objeto de tipo persona
        Persona p2 = new Persona("Juan", 33);
        System.out.println("\nImprimimos el objeto p2");
        System.out.println(p2);
        
        //Creamos un objeto empleado
        Empleado e1 = new Empleado("Pedro", 29, 18000);
        System.out.println("\nImprimimos el objeto e1");
        System.out.println(e1);
    }
    
}
