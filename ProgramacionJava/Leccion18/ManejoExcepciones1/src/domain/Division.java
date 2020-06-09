package domain;

public class Division {
    //Atributos
    private int numerador;
    private int denominador;
    
    //Constructor
    public Division(int numerador, int denominador) throws OperationException{
        if (denominador == 0) {
            //throw new IllegalArgumentException("Denominador igual a 0");
            throw new OperationException("Denominador igual a 0");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    //Metodos
    public void visualizarOperacion(){
        System.out.println("El resultado de la division es: " + numerador / denominador);
    }
}
