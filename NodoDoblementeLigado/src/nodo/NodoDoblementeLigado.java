package nodo;

public class NodoDoblementeLigado<T> {

    Nodo<T> head;
    int posicion;

    public NodoDoblementeLigado() {

    }

    public NodoDoblementeLigado(Nodo<T> head, int posicion) {
        this.head = null;
        this.posicion = 0;
    }

    public boolean getVacia() {
        return this.head == null;
    }

    public int getPosicion() {
        return posicion;
    }

    public void getAgregarAlFinal(T Final) {

        Nodo<T> nodoFinalNuevo = new Nodo<>(Final);

        if (getVacia()) {
            this.head = nodoFinalNuevo;
        } else {

            Nodo<T> aux = this.head;

            while (aux.getSiguiente() != null) {

                aux = aux.getSiguiente();

            }

            nodoFinalNuevo.setAnterior(aux);
            aux.setSiguiente(nodoFinalNuevo);
            aux = null;
            nodoFinalNuevo = null;

        }

    }

    public void getAgragarAlInicio(T valorNuevo) {

        Nodo<T> nuevoNodoPrincipio = new Nodo(valorNuevo);

        if (getVacia()) {
            this.head = nuevoNodoPrincipio;
        } else {
            nuevoNodoPrincipio.setSiguiente(this.head);
            head.setAnterior(nuevoNodoPrincipio);
            this.head = nuevoNodoPrincipio;
        }

    }

    public void imprimirTodoALV() {

        Nodo imprimir = this.head;

        while (imprimir.getSiguiente() != null) {

            System.out.print(imprimir);
            imprimir = imprimir.getSiguiente();

        }

        System.out.print(imprimir);
        System.out.println("");

    }

    public void AgregarDespuesDe(T valorNuevo, int posicion) {

        Nodo valorNuevoNodo = new Nodo(valorNuevo);
        Nodo nodoCopia = this.head;

        for (int i = 1; i <= posicion - 1; i++) {

            nodoCopia = nodoCopia.getSiguiente();
        }

        valorNuevoNodo.setSiguiente(nodoCopia.getSiguiente());
        //nodoCopia.setAnterior(nodoCopia.getAnterior());
        valorNuevoNodo.setAnterior(nodoCopia.getAnterior());
        nodoCopia.setSiguiente(valorNuevoNodo);
        nodoCopia.setAnterior(nodoCopia.getAnterior());
        valorNuevo = null;
        nodoCopia = null;

    }

    public void eliminarALV(int posicion) {

        Nodo nodoCopia = this.head;

        for (int i = 0; i <= posicion; i++) {

            nodoCopia = nodoCopia.getSiguiente();

        }

        nodoCopia.setAnterior(nodoCopia.getAnterior().getAnterior());
        nodoCopia.setSiguiente(nodoCopia.getSiguiente().getSiguiente());

    }

    public void getTamanio() {
        Nodo nodoCopia = this.head;
        int contador = 0;

        while (nodoCopia != null) {

            nodoCopia=nodoCopia.getSiguiente();
            contador++;

        }
        System.out.println("Tamanio: "+contador);
    }
    
    public void eliminarElPrimero(){
        Nodo nodoCopia = this.head;
        
        this.head = nodoCopia.getSiguiente();
    }
    
    public void eliminarElUltimo(){
        Nodo nodoCopia = this.head;
        
        while (nodoCopia != null) {

            nodoCopia = nodoCopia.getSiguiente();
            System.out.println(nodoCopia);
            
        }
        
        
    }

}
