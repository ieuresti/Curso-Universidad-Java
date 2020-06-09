package sentenciascontrol;

public class CalculaMesSwitch {

    public static void main(String[] args) {
        // TODO code application logic here
        int mes = 4;
        String estacion;
        
        String saludo = "Hola Mundo";
        
        switch(mes){
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otoño";
                break;
            default:
                estacion = "Mes incorrecto";
        }
        
        System.out.println("La estacion para el mes " + mes + " es: " + estacion);
    }
    
}
