package palabrathis;

public class PalabraThis {

    public static void main(String[] args) {
        // TODO code application logic here
        Persona p = new Persona("Juan");
    }
}

class Persona{
    String nombre; //Atributo de la clase
    
    Persona(String nombre){
        this.nombre = nombre; //this es el objeto Persona (actual)
        
        //Imprimimos el objeto Persona
        Imprimir i = new Imprimir();
        i.imprimir(this); //this es el objeto Persona (actual)
    }
}

class Imprimir{
    
    public void imprimir(Object o){
        System.out.println("Imprimir parametro: " + o); //El parametro es el objeto Persona
        System.out.println("Imprimir objeto actual: " + this); //this es el objeto imprimir actual
    }
}
