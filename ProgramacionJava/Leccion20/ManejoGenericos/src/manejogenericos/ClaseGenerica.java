package manejogenericos;

//Definimos una clase generica con el operador diamante <>
public class ClaseGenerica<T> {
    //Definimos una variable de tipo generico
    T objeto;
    
    //Constructor que inicializa el tipo a utilizar
    public ClaseGenerica(T objeto){
        this.objeto = objeto;
    }
    
    //Metodo para obtener el tipo definido en esta clase generica
    public void obtenerTipo() {
        System.out.println("El tipo T es: " + objeto.getClass().getName());
    }
}
