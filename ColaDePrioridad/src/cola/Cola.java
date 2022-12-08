package cola;

/**
 *
 * @author victo
 */
public class Cola<T> {

    Nodo<T>[] datoCola;
    public static int numeroElementos;

    public Cola() {
    }

    public Cola(Nodo<T>[] datoCola) {
        this.datoCola = datoCola;
    }

    public boolean is_empty() {

        return this.datoCola == null;
    }

    public int length() {
        
        return numeroElementos;

    }
    
    public void enqueue( int prioridad, Nodo elemento){
        
        Nodo nuevoDato = new Nodo(elemento);
        
        this.datoCola = nuevoDato;
        numeroElementos++;
        
    }

}
