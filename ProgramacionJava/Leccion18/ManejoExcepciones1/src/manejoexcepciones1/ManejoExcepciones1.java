package manejoexcepciones1;

import domain.*;

public class ManejoExcepciones1 {

    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Division division = new Division(10, 0);
            division.visualizarOperacion();
        } catch (OperationException oe) {
            System.out.println("Ocurrio un error!!!");
            oe.printStackTrace();
        }
    }
    
}
