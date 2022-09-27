package nodo;

/**
 *
 * @author victo
 */
public class Nodo<T> {

    private T head;
    private Nodo<T> siguiente;
    private Nodo<T> anterior;

    public Nodo() {
    }

    /*ESTE CONSTRUCTOR VA A SERVIR PARA INICIALIZAR LA LISTA, ES CUANDO NO HAY
    DATOS
     */
    public Nodo(T head) {
        this.head = head;
    }

    /*ESTE CONSTUCTOR ES CUANDO YA HAY DATOS EN LA LISTA
     */
    public Nodo(T head, Nodo<T> siguiente, Nodo<T> anterior) {
        this.head = head;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    //CREAMOS LOS METOS DE ACCESO PARA MOSTRAR Y MODIFICAR CADA ATRIBUTO
    public Nodo<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo<T> anterior) {
        this.anterior = anterior;
    }

    public T getHead() {
        return head;
    }

    public void setHead(T head) {
        this.head = head;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "|" + head + "| -->";
    }

    public boolean getHeadVacio() {
        return this.head == null;
    }

    public void getAgregarAlFinal(T Final) {

        Nodo<T> nodoFinal = new Nodo<>(Final);

        if (getHeadVacio()) {
            this.head = Final;
        } else {

            Nodo<T> aux = this.siguiente;

            while (aux.getSiguiente() != null) {

                aux = aux.getSiguiente();

            }

            nodoFinal.setAnterior(aux);
            aux.setSiguiente(nodoFinal);
            aux = null;
            nodoFinal = null;

        }
        
       
    }
    
     public void getAgragarAlInicio(T valorNuevo){
            
         Nodo nuevoNodoPrincipio = new Nodo(valorNuevo);
         
         if(getHeadVacio()){
             this.head = valorNuevo;
         }
         
         else{
             nuevoNodoPrincipio.setSiguiente(this.siguiente);
             head.setAnterior(valorNuevo);
             this.head  = nuevoNodoPrincipio;
         }
         
        }

}
