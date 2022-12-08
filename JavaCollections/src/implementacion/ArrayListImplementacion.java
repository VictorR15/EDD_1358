package implementacion;

import java.util.ArrayList;

/**
 *
 * @author victo
 */
public class ArrayListImplementacion {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> lista = new ArrayList<>();
        
        //add AÑADE UN ELEMENTO A LA LISTA 
        
        lista.add(0);
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        
        
        //IMPRIMIMOS LA LISTA QUE SE AÑADIO CON add 
        System.out.println("ADD");
        System.out.println(lista);
        System.out.println("------------------\n");
        
        
        //remove REMUEVE ELEMENTOS DE LA LISTA CON EL INDECE
        System.out.println("REMOVE");
        lista.remove(3);
        
        
        //IMPRIMIMOS LA LISTA CON EL ELEMENTO REMOVIDO
        System.out.println(lista);
        System.out.println("------------------\n");
        
        //size MUESTRA EL NUMERO DE LOS ELEMENTOS EN LA LISTA
        System.out.println("SIZE");
        System.out.println(lista.size());
        System.out.println("------------------\n");
        
        //isEmpty MUESTRA SI LA LISTA ESTA VACIA
        System.out.println("ISEMPTY");
        System.out.println(lista.isEmpty());
        System.out.println("------------------\n");
        
        //clear LIMPIA LA LISTA 
        System.out.println("CLEAR");
        lista.clear();
        System.out.println(lista);
        System.out.println("------------------\n");
        
        
    }
    
    
}
