package entradadatosscanner;

import java.util.*;

public class EntradaDatosScanner {

    public static void main(String[] args) {
        // TODO code application logic here
        String captura = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un dato:");
        captura = scan.nextLine();
        while (captura != null) {
            System.out.println("Dato introducido: " + captura);
            captura = scan.nextLine();
        }
    }
    
}
