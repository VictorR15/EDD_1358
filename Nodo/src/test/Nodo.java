package test;

public class Nodo<T> {

    private T cabeza;
    private Nodo<T> siguiente;

    public Nodo() {
    }

    /*EN ESTE CONSTRUCTOR SOLO SIRVE PARA INICIAR EL 
    NODO EN ESTE CASO ES "HEAD" 
     */
    public Nodo(T dato) {
        this.cabeza = dato;
    }

    /*EN ESTE CONSTRUCTOR ES PARA LOS DEMAS NODOS EN 
    DONDE SE SUMA OTRO POR ESO SE PONE CREA OTRO NODO 
    EN EL MISMO CONSTRUCTOR, ES COMO CREAR UN NUEVO 
    OBJETO DENTRO DE UN CONSTRUCTOR
     */
    public Nodo(T dato, Nodo<T> siguiente) {
        this.cabeza = dato;
        this.siguiente = siguiente;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    public T getDato() {
        return cabeza;
    }

    public void setDato(T dato) {
        this.cabeza = dato;
    }

    @Override
    public String toString() {
        return "|" + cabeza + "| -->";
    }

//    public void estaVacia() {
//
//        if (this.cabeza == null || getSiguiente() == null) {
//
//            System.out.println("El nodo esta vacia");
//        } else {
//            System.out.println("No esta vacia ");
//        }
//    }

    public void estaVacia(){
        reuturn this.cabeza = null;
    }
    public void getTamanio() {

        Nodo copiaCabeza = this.siguiente;
        int contador=0;
        while(copiaCabeza != null){
            copiaCabeza = this.siguiente;
            contador =+1;
        }
        
        System.out.println("El tamaño es: "+contador);
    }
}
