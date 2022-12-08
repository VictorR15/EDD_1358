package implementacion;

import java.util.Stack;

/**
 *
 * @author victo
 */
public class StackImplementacion {
    
    public static void main(String[] args) {
        
        Stack<Integer> lista = new Stack<>();
        
        //push AGRAGAMOS UN ELEMENTO A LA LISTA
        lista.push(0);
        lista.push(1);
        lista.push(2);
        lista.push(3);
        lista.push(4);
        lista.push(5);
        System.out.println("PUSH");
        System.out.println(lista);
        System.out.println("-------------------------\n");
        
        //size CANTIDAD DE ELEMETOS EN LA LISTA
        System.out.println("SIZE");
        System.out.println(lista.size());
        System.out.println("-------------------------\n");
        
        //pop SE SACA EL ULTIMO ELEMENTO DE LA LISTA
        System.out.println("POP");
        lista.pop();
        System.out.println(lista);
        System.out.println("-------------------------\n");
        
        //peek SE CONSULTA EL ULTIMO ELEMENTO DE LA LISTA
        System.out.println("PEEK");
        System.out.println(lista.peek());
        System.out.println("-------------------------\n");
        
        //isEmpty SE MUESTA SI LA LISTA ESTA VACIA 
        System.out.println("ISEMPTY");
        System.out.println(lista.isEmpty());
        System.out.println("-------------------------\n");
        
        //clear LIMPIA LA LISTA
        System.out.println("CLEAR");
        lista.clear();
        System.out.println(lista);
        System.out.println("-------------------------\n");
        
        
    }
    
}
