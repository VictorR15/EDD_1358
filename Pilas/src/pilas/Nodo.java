package pilas;

/**
 *
 * @author victo
 */
public class Nodo<T> {

    private T base;
    private Nodo<T> top;

    public Nodo(T base, Nodo<T> top) {
        this.base = base;
        this.top = top;
    }

    public Nodo<T> getTop() {
        return top;
    }

    public void setTop(Nodo<T> top) {
        this.top = top;
    }

    public T getBase() {
        return base;
    }

    public void setBase(T base) {
        this.base = base;
    }
    
    
    
    
}
