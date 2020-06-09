package pasoporvalor;

public class PasoPorValor {

    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10;
        imprimir(x); //Imprime 10
        cambiarValor(x);
        imprimir(x); //Imprime 10
        
    }
    
    public static void cambiarValor(int i){
        i = 200;
    }
    
    public static void imprimir(int arg){
        System.out.println("Valor recibido: " + arg);
    }
}
