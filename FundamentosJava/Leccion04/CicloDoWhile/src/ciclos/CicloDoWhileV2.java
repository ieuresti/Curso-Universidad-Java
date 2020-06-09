package ciclos;

import java.util.Scanner;

public class CicloDoWhileV2 {
    
    public static void main(String[] args) {
        System.out.println("Ingresa el limite de elementos a iterar:");
        int limElementos;
        Scanner entradaEscaner = new Scanner(System.in); //Creacion de objeto Scanner para leer datos
        limElementos = entradaEscaner.nextInt(); //Leemos el valor proporcionado por el usuario
        int contador = 0;
        
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador < limElementos);
        
    }
    
}
