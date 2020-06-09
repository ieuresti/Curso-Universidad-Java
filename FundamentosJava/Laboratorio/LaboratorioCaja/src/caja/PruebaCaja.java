package caja;

public class PruebaCaja {
    
    public static void main(String[] args) {
        
        //Variables locales
        int ancho = 3;
        int alto = 2;
        int profundo = 6;
        
        //Creacion del objeto caja enviando argumentos
        Caja obj1 = new Caja(ancho, alto, profundo);
        
        //Resultado del volumen
        System.out.println("El volumen de la caja es: " + obj1.calcularVolumen());
    }
    
}
