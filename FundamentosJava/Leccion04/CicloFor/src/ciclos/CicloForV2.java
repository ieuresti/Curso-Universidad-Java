package ciclos;

import java.util.Scanner;

public class CicloForV2 {
    
    public static void main(String[] args) {
        System.out.println("Ingresa el limite del ciclo:");
        int limite;
        Scanner entradaEscaner = new Scanner(System.in);
        limite = entradaEscaner.nextInt();
        
        for (int contador = 0; contador < limite; contador++) {
            System.out.println("contador = " + contador);
        }
    }
    
}
