package colas;


/**
 *
 * @author victo
 */
public class ColaTest {

    public static void main(String[] args) {
        
        Cola<Integer> lista = new Cola<>();
        
        lista.enqueue(12);
        lista.enqueue(15);
        lista.to_String();
        System.out.println(lista.is_empty());
        System.out.println(lista.length());
        lista.enqueue(19);
        lista.dequeue();
        lista.to_String();
        
        
        
    }
    
    
    
}
