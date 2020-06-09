package ejemploherencia;

public class EjemploHerencia {

    public static void main(String[] args) {
        // TODO code application logic here
        Empleado e1 = new Empleado("Juan", 25000);
        System.out.println("Imprimimos el objeto Empleado1");
        System.out.println(e1);
        
        Empleado e2 = new Empleado("Pedro", 15000);
        e2.setEdad(28);
        e2.setGenero('M');
        e2.setDireccion("Bogota, Colombia");
        System.out.println("\nImprimimos el objeto Empleado2");
        System.out.println(e2);
        
        //Al crear un nuevo objeto de java.util.Date nos regresa la fecha actual
        Cliente c1 = new Cliente(new java.util.Date(), false);
        System.out.println("\nImprimimos el objeto Cliente1");
        System.out.println(c1);
        //Completamos el objeto persona asociado a este objeto cliente
        c1.setNombre("Karla");
        c1.setEdad(22);
        c1.setGenero('F');
        c1.setDireccion("Mexico, DF");
        System.out.println("\nVolvemos a imprimir el objeto Cliente1");
        System.out.println(c1);
    }
    
}
