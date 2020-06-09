package abstracto.domain;

public abstract class FiguraGeometrica {
    //Atributos
    protected String tipoFigura;
    
    //Constructor
    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
    
    //Metodos
    //La clase Padre no define comportamiento
    public abstract void dibujar();
    
    public String getTipoFigura(){
        return tipoFigura;
    }
    
    public void setTipoFigura(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
    
    public String toString(){
        return "Tipo de Figura: " + this.tipoFigura;
    }
}
