package ejemploinstanceof;

public class EjemploInstanceOf {

    public static void main(String[] args) {
        
        FiguraGeometrica figura; //Variable de tipo FiguraGeometrica
        figura = new Elipse();
        //Determina solo un tipo el que corresponda a la jerarquia
        determinaTipo(figura);
        //Determina todos los tipos posibles
        System.out.println("\nTodos sus tipos:");
        determinaTodosLosTipos(figura);
    }
    
    private static void determinaTodosLosTipos(FiguraGeometrica figura){
        if (figura instanceof Elipse) {
            //Procesa algo particular de la Elipse
            System.out.println("Es una elipse");
        }
        if (figura instanceof Circulo) {
            //Procesa algo particular del Circulo
            System.out.println("Es un circulo");
        }
        if (figura instanceof FiguraGeometrica) {
            //Procesa algo particular de la Figura Geometrica
            System.out.println("Es una Figura Geometrica");
        }
        if (figura instanceof Object) {
            //Procesa algo particular de la clase Object
            System.out.println("Es un Object");
        } else {
            System.out.println("No se encontro el tipo");
        }
    }
    
    private static void determinaTipo(FiguraGeometrica figura){
        if (figura instanceof Elipse) {
            //Procesa algo particular de la Elipse
            System.out.println("Es una elipse");
        } else if (figura instanceof Circulo) {
            //Procesa algo particular del Circulo
            System.out.println("Es un circulo");
        } else if (figura instanceof FiguraGeometrica) {
            //Procesa algo particular de la Figura Geometrica
            System.out.println("Es una Figura Geometrica");
        } else if (figura instanceof Object) {
            //Procesa algo particular de la clase Object
            System.out.println("Es un object");
        } else {
            System.out.println("No se encontro el tipo");
        }
    }
}
