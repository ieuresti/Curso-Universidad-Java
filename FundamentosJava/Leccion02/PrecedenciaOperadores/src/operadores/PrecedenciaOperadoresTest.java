package operadores;

public class PrecedenciaOperadoresTest {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Primer Ejemplo Precedencia Operadores");
        int x = 5;
        int y = 10;
        int z = ++x * y--;
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        System.out.println("Ejemplo evaluacion");
        System.out.println(4 + 5 * 6 / 3);
        System.out.println((4 + 5) * (6 / 3));
        
        System.out.println("Otro ejemplo evaluacion");
        System.out.println(1 + 2 - 3 * 4 / 5);
        System.out.println(1 + 2 - (3 * (4 / 5)));
        
        System.out.println("\nOtro ejemplo");
        //Si detecta una cadena, lo demas lo convierte en cadena
        System.out.println("1 + 2 = " + 1 + 2);
        //Los parentesis rompen esta regla, ya que tienen la mayor prioridad
        System.out.println("(1 + 2) = " + (1 + 2));
        
        System.out.println("\nOtro ejemplo");
        //El operador + es asociativo a la izquierda
        System.out.println(1 + 2 + "abc"); //Detecta una operacion primero
        System.out.println("abc" + 1 + 2); //Detecta una cadena primero
    }
    
}
