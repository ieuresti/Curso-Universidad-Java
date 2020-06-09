package ejemploenumeraciones;

public class EjemploEnumeraciones {

    public static void main(String[] args) {
        //Valores de la enumeracion
        System.out.println("Valor1: " + Dias.LUNES);
        
        //Hacemos un test del dia utilizado
        indicarDia(Dias.VIERNES);
        
        //Utilizamos laenumeracion de paises
        System.out.println("");
        System.out.println("Continente no. 4: " + Continentes.AMERICA);
        System.out.println("Paises en America: " + Continentes.AMERICA.getPaises());
        
        //Hacemos el test del numero de paises por continente
        System.out.println("");
        indicarPaises(Continentes.AFRICA);
        
        //Imprimimos los continentes
        System.out.println("");
        imprimirContinentes();
    }
    
    public static void indicarDia(Dias dias){
        switch(dias){
            //Podemos usar algun valor constante de la enumeracion directamente
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            default:
                System.out.println("Y asi seguimos con los demas dias");
        }
    }
    
    public static void indicarPaises(Continentes continentes){
        //Podemos usar algun valor constante de la enumeracion directamente
        switch(continentes){
            case AFRICA:
                System.out.println("No. Paises en " + continentes + ": " + continentes.getPaises());
                break;
            default:
                System.out.println("Y asi seguimos con los demas continentes");
        }
    }
    
    public static void imprimirContinentes(){
        //Utilizamos un forEach
        for (Continentes c : Continentes.values()) {
            System.out.println("Continente: " + c + " continente " + c.getPaises() + " paises.");
        }
    }
}
