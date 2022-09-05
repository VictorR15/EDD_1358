
package edd1358bases;

import adts.arrays.ArregloADT;
import ico.fes.Alumno;


public class EDD1358Bases {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno al1=new Alumno("452442", "José", "ICO", 8.0);
        Alumno al2=new Alumno("333333", "María", "DER", 11.0);
        Alumno al3=new Alumno("555555", "Jesús", "ICO", 9.0);
        System.out.println(al3);
        
        ArregloADT lista = new ArregloADT(5);
        lista.setElemento(0, al1);
        lista.setElemento(2, al2);
        lista.setElemento(4, al3);
        
        System.out.println(lista);
        
        lista.setElemento(10, al3);
        System.out.println("--- get ---");
        System.out.println( lista.getElemento(2));
        
    }
    
}
