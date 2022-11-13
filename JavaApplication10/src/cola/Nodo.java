package cola;



/**
 *
 * @author victo
 */
public class Nodo <T>{
   
    private int prioridad;
    private T dato;

    public Nodo() {
    }

    public Nodo(int prioridad, T dato) {
        this.prioridad = prioridad;
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Nodo{" + "prioridad=" + prioridad + ", dato=" + dato + '}';
    }
    
    
   
    
}
