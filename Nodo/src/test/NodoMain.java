package test;

public class NodoMain {

    public static void main(String[] args) {
        Nodo<Integer> head = new Nodo(10);
        System.out.print(head);

        head.setSiguiente(new Nodo(11, null));
        System.out.print(head.getSiguiente());
        head.getSiguiente().setSiguiente(new Nodo<>(69, null));
        System.out.print(head.getSiguiente().getSiguiente());
        System.out.println("");
        head.estaVacia();
        head.getTamanio();

    }

}


