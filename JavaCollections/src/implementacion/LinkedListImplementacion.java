package implementacion;

import java.util.LinkedList;

/**
 *
 * @author victo
 */
public class LinkedListImplementacion {
    
    public static void main(String[] args) {
        
        LinkedList<String> lista = new LinkedList<>();
    
        //add PARA AGREAGAR UN ELEMENTO EN LA LISTA
        lista.add("A");
        lista.add("E");
        lista.add("O");
        lista.add("U");
        System.out.println("ADD");
        System.out.println(lista);
        System.out.println(".....................\n");
        
        //add index AGREGAR UN ELEMENTO EN UNA POSICION ESPECIFICA
        lista.add(2, "I");
        System.out.println("ADD INDEX");
        System.out.println(lista);
        System.out.println(".....................\n");
        
        //set CAMBIAR ELEMTOS 
        lista.set(0, "a");
        System.out.println("SET");
        System.out.println(lista);
        System.out.println(".....................\n");
        
        //remove ELIMINAR ELEMETOS
        lista.remove("O");
        System.out.println("REMOVE");
        System.out.println(lista);
        System.out.println(".....................\n");
        
        //remove index ELIMINAR ELEMENTO EN UNA POSICION ESPECIFICA
        lista.remove(3);
        System.out.println("REMOVE INDEX");
        System.out.println(lista);
        System.out.println(".....................\n");
        
        //clear ELIMINA TODOS LOS ELEMENTOS
        lista.clear();
        System.out.println("CLEAR");
        System.out.println(lista);
        System.out.println(".....................\n");
        
        
        
        
        
        
    }
    
    
    
    
}
