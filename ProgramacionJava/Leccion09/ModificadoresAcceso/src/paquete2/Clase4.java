package paquete2;

import paquete1.Clase1;

public class Clase4 {
    
    public Clase4(){
        //Constructor protegido, restringido al no ser una subclase
        //super(1, 2);
        //Acceso package, y al estar fuera de paquete esta restringido
        //super(1, 2, 3);
        //Acceso privado, restringido
        //super(1, 2, 3, 4);
    }
    
    public void pruebaDesdeClase4(){
        //Acceso a Clase1 desde Clase4
        //Clase4 NO es subclase y esta en otro paquete
        Clase1 c1 = new Clase1();
        System.out.println("");
        System.out.println("Atributo publico: " + c1.atrPublico);
        System.out.println("Atributo protegido: No se puede acceder desde un paquete externo al NO ser una subclase");
        System.out.println("Atributo default: No se puede acceder desde un paquete externo");
        System.out.println("Atributo private: Acceso negado");
        
        //Constructor publico
        new Clase1();
        //Los demas constructores estan restringidos
        
        System.out.println("");
        System.out.println("Metodo publico: " + c1.metodoPublico());
        System.out.println("Metodo protegido: No se puede acceder desde un paquete externo al NO ser una subclase");
        System.out.println("Metodo default: No se puede acceder desde un paquete externo");
        System.out.println("Metodo private: Acceso negado");
    }
}
