package caja;

public class Caja {
    
    //Atributos
    int anchura;
    int altura;
    int profundidad;
    
    //Constructor vacio
    Caja(){}
    
    //Constructor con los 3 argumentos o atributos de la clase
    Caja(int anchura, int altura, int profundidad){
        this.anchura = anchura;
        this.altura = altura;
        this.profundidad = profundidad;
    }
    
    //Metodo para calcular volumen
    int calcularVolumen(){
        return anchura * altura * profundidad;
    }
    
}
