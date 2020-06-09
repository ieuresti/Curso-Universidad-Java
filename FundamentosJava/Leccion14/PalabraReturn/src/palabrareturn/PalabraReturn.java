package palabrareturn;

public class PalabraReturn {

    public static void main(String[] args) {
        // TODO code application logic here
        int resultado = sumar(3, 6);
        System.out.println("Resultado: " + resultado);
    }
    
    public static int sumar(int a, int b){
        if (a == 0 && b == 0) {
            System.out.println("Proporciona valores distintos a cero");
            return 0;
        }
        return a + b;
    }
    
}
