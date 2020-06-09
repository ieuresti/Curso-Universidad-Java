package com.gm.javadoc;

/**
 * Esta clase permite realizar operaciones de aritmetica como sumar, restar, etc
 * 
 * @author Ivan
 * @version: 1.0
 */
public class Aritmetica {
    
    /**
    * Primer operando
    */
    int operandoA;
    
    /**
     * Segundo operando
     */
    int operandoB;
    
    /**
     * Constructor vacio de la clase
     */
    public Aritmetica(int arg1, int arg2){
        operandoA = arg1;
        operandoB = arg2;
    }
 
    /**
     * Este metodo utiliza la suma de 2 operandos enteros
     * @return int resultado de la suma
     */
    public int sumar(){
        return operandoA + operandoB;
    }
}
