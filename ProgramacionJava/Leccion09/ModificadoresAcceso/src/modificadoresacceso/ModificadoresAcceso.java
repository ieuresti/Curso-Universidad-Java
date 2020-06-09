package modificadoresacceso;

import paquete1.Clase2;
import paquete2.Clase3;
import paquete2.Clase4;

public class ModificadoresAcceso {

    public static void main(String[] args) {
        //Prueba de accesos a Clase1 desde otras clases
        
        //Acceso a Clase1 desde Clase2
        System.out.println("***Acceso desde Clase2 a Clase1 (mismo paquete)***");
        new Clase2().pruebaDesdeClase2();
        
        //Acceso a Clase1 desde Clase3
        System.out.println("\n***Acceso desde Clase3 a Clase1 (diferente paquete, pero es subclase)***");
        new Clase3().pruebaDesdeClase3();
        
        //Acceso a Clase1 desde Clase4
        //Clase4 NO es subclase y esta en otro paquete
        System.out.println("\n***Acceso desde Clase4 a Clase1 (difernte paquete, NO es subclase)***");
        new Clase4().pruebaDesdeClase4();
    }
    
}
