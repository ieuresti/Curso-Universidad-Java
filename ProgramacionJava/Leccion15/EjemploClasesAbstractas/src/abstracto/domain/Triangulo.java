package abstracto.domain;

public class Triangulo extends FiguraGeometrica{
    //Constructor
    public Triangulo(String tipoFigura){
        super(tipoFigura);
    }
    
    //Metodos
    public void dibujar(){
        //Comportamiento de la subclase
        System.out.println("Aqui deberia dibujar un: " + this.getClass().getSimpleName()); //Obtener el nombre de la clase con la cual estamos trabajando en este momento
    }
}
