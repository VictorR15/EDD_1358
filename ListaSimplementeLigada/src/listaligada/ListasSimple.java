package listaligada;

/**
 *
 * @author victo
 */
public class ListasSimple<T> {

    private Nodo<T> inicio;
    private int tamanio;

    public ListasSimple() {

        this.inicio = null;
        this.tamanio = 0;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void insertar(T elemento) {

        Nodo nuevoElemento = new Nodo(elemento);

        if (vacia()) {
            this.inicio = nuevoElemento;
        } else {
            Nodo auxNodo = this.inicio;

            while (auxNodo != null) {

                auxNodo = auxNodo.sig;

            }

        }

        tamanio++;

    }

    public boolean eliminar(int elemento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean buscar(int elemento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String recorrer() {

        String imprimir = "";

        Nodo auxNodo = this.inicio;

        while (auxNodo != null) {

            System.out.println(auxNodo.dato);
            auxNodo = auxNodo.sig;
        }

        return imprimir;

    }

    public boolean vacia() {

        return this.inicio == null;
    }

    public int tamanio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
