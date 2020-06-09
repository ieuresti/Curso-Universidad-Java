package manejojavabeans;

import beans.PersonaBean;

public class ManejoJavaBeans {

    public static void main(String[] args) {
        
        PersonaBean bean = new PersonaBean();
        //Inicializando los valores
        bean.setNombre("Juan");
        bean.setEdad(29);
        
        System.out.println("Nombre: " + bean.getNombre());
        System.out.println("Edad: " + bean.getEdad());
    }
    
}
