package nodo;

/**
 *
 * @author victo
 */
public class NodoMain {

    public static void main(String[] args) {

        NodoDoblementeLigado<Integer> lista = new NodoDoblementeLigado<>();

        lista.getAgregarAlFinal(99);
        lista.getAgregarAlFinal(55);
        lista.getAgregarAlFinal(9);
        lista.getAgregarAlFinal(88);
        lista.getAgregarAlFinal(100);
        

        lista.imprimirTodoALV();
        lista.AgregarDespuesDe(56, 2);

        //lista.eliminarALV(3);
        lista.imprimirTodoALV();
        lista.eliminarALV(2);
        lista.imprimirTodoALV();
        lista.getTamanio();
        lista.eliminarElPrimero();
        lista.imprimirTodoALV();
        System.out.println("----------------");
        lista.eliminarElUltimo();
        //lista.imprimirTodoALV();
        
        

    }
}
