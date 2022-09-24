package test;

public class NodoMain {

    public static void main(String[] args) {
        Nodo<Integer> head = new Nodo(10);
        System.out.print(head);

        head.setSiguiente(new Nodo(11, null));
        System.out.print(head.getSiguiente());
        head.getSiguiente().setSiguiente(new Nodo<>(69, null));
        System.out.print(head.getSiguiente().getSiguiente());
        System.out.print("");
        head.getSiguiente().getSiguiente().setSiguiente(new Nodo<>(88, null));
        System.out.print(head.getSiguiente().getSiguiente().getSiguiente());
        head.estaVacia();
        head.getTamanio();
        
        
        

    }

}


