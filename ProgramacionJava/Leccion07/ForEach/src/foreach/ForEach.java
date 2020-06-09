package foreach;

public class ForEach {

    public static void main(String[] args) {
        //Creamos un arreglo de personas
        Persona[] personas = {new Persona("Juan"), new Persona("Karla")};
        
        //Iteramos cada elemento del arreglo de personas
        for (Persona p : personas) {
            //Accedemos a las propiedades y/o metodos del objeto
            String nombre = p.getNombre();
            System.out.println("Nombre persona: " + nombre);
        }
        
        System.out.println("");
        //Creamos un arreglo de enteros
        int [] edades = {15, 20, 41, 50};
        //Iteramos el arreglo
        for (int edad : edades) {
            System.out.println("Edad: " + edad);
        }
    } 
}
