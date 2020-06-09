package aritmetica;

public class PruebaAritmetica {
    
    public static void main(String[] args) {
        
        //Variables locales
        int operandoA = 6;
        int operandoB = 2;
        
        //Creamos un objeto de la clase Aritmetica enviando argumentos
        Aritmetica obj1 = new Aritmetica(operandoA, operandoB);
        
        //Imprimir operandos
        System.out.println("Operando A: " + operandoA + " y operando B: " + operandoB);
        
        //Resultado de la suma
        System.out.println("\nResultado suma: " + obj1.sumar());
        
        //Resultado de la resta
        System.out.println("\nResultado resta: " + obj1.restar());
        
        //Resultado de la multiplicacion
        System.out.println("\nResultado multiplicacion: " + obj1.multiplicar());
        
        //Resultado de la division
        System.out.println("\nResultado division: " + obj1.dividir());
    }
    
    /*
    void otroMetodo(){
        //No se puede acceder a una variable local declarada en  otro metodo
        System.out.println("valor operandoA" + operandoA);
    }
    */
}
