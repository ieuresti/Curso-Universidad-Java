package operadores;

public class ManejoOperadoresTest {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Operadores Aritmeticos");
        int a = 1 + 2;
        int b = a * 4;
        int c = b / 2;
        int d = c - a;
        int e = -d;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        
        System.out.println("\nOperador Modulo (residuo):");
        System.out.println("x mod 10 = " + a % 2);
        
        System.out.println("\nOperador Compuesto:");
        //a = a + 4
        a += 2;
        b -= 4;
        c *= a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        System.out.println("\nOperador Incremento:");
        //int a = a + 1;
        //Puede reescribirse como:
        a++;
        System.out.println("a = " + a);
        //Preincremento/decremento (se incrementa antes de asignar el valor)
        c = ++a;
        //Postincremento/decremento (se incrementa despues de asignar el valor)
        //La siguiente vez que se evalua b, es cuando se incrementa
        d = b++;
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        System.out.println("\nOperador Relacional:");
        //a es menor que b
        boolean res = a < b;
        System.out.println("res = " + res);
        
        System.out.println("\nOperador Ternario:");
        int min = ( a < b) ? a : b; //Si a es < b (osea true) entonces el valor de a se le asignara a min
        System.out.println("min = " + min);
        
        System.out.println("\nOperador Asignacion:");
        int i, j, k;
        //cadena de asignacion
        i = j = k = 100; //valor de i, j, k igual a 100
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        
    }
    
}
