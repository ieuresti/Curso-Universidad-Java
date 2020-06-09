package calculadoraentradadatos;

import java.util.*;
import static calculadora.Operaciones.*;

public class CalculadoraEntradaDatos {

    public static void main(String[] args) {
        
        System.out.println("Proporciona el primer valor:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Proporciona el segundo valor:");
        int b = scan.nextInt();
        int resultado = restar(a, b);
        System.out.println("El resultado de la operacion es: " + resultado);
    }
}
