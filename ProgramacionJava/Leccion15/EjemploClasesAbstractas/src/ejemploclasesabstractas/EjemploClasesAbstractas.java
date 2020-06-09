package ejemploclasesabstractas;

import abstracto.domain.*;

public class EjemploClasesAbstractas {

    public static void main(String[] args) {
        //Creacion de objetos
        //Una clase abstracta no se puede instanciar
        //FiguraGeometrica rectangulo = new FiguraGeometrica("Rectangulo");
        FiguraGeometrica rectangulo = new Rectangulo("Rectangulo");
        FiguraGeometrica triangulo = new Triangulo("Triangulo");
        FiguraGeometrica circulo = new Circulo("Circulo");
        
        System.out.println(rectangulo);
        rectangulo.dibujar();
        
        System.out.println("");
        System.out.println(triangulo);
        triangulo.dibujar();
        
        System.out.println("");
        System.out.println(circulo);
        circulo.dibujar();
    }
    
}
