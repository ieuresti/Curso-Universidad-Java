package ejemplopolimorfismo;

public class EjemploPolimorfismo {

    public static void main(String[] args) {
        
        Empleado emp = new Empleado("Juan", 1000);
        imprimirDetalles(emp);
        
        Gerente ger = new Gerente("Karla", 1450, "Finanzas");
        imprimirDetalles(ger);
    }
    
    //Observamos que el tipo que recibe el metodo es de tipo padre (Empleado)
    //sin embargo al momento de ejecutar el metodo, se ejecuta el del hijo (Gerente)
    //eso es el polimorfismo, multiples formas pero en tiempo de ejecucion
    public static void imprimirDetalles(Empleado emp){
        System.out.println(emp.obtenerDetalles());
    }
}
