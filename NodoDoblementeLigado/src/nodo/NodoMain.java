package nodo;

/**
 *
 * @author victo
 */
public class NodoMain {

    public static void main(String[] args) {

        Nodo<Integer> cabeza = new Nodo<>(50);
        
        cabeza.setSiguiente(new Nodo<>(4, null, cabeza));

        System.out.print(cabeza);
        System.out.print(cabeza.getSiguiente());
        
        System.out.println(cabeza.getAnterior());
        
        cabeza.getAgregarAlFinal(15);
        System.out.println(cabeza.getSiguiente().getSiguiente());
        
        

    }
}
