package cola;



/**
 *
 * @author victo
 */
public class Nodo <T>{
   
    
    private T dato;

    public Nodo() {
    }

    public Nodo(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }

    
    
    
   
    
}
