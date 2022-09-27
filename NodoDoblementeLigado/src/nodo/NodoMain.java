package nodo;

/**
 *
 * @author victo
 */
public class NodoMain {

    public static void main(String[] args) {

        Nodo<Integer> cabeza = new Nodo<>();
        

       cabeza.getAgragarAlInicio(55);
        
        //System.out.println(cabeza.getAnterior());
        
        cabeza.getAgregarAlFinal(15);
        System.out.print(cabeza.getSiguiente().getSiguiente());
        
        

    }
}
