package pilas;

/**
 *
 * @author victo
 */
public class Nodo<T> {

    private T valorInicial;
    private Nodo<T> sig;

    public Nodo(T _base) {
        this.valorInicial = _base;
    }

    //CONSTRUCTOR PARA DECLAR LA BASE 
    
    public Nodo(T _base, Nodo<T> _sig) {
        this.valorInicial = _base;
        this.sig = _sig;
    }
    

//    CONSTRUCTOR PARA CREAR UN NUEVO TOP
//    public Nodo(T base, Nodo<T> top) {
//        this.base = base;
//        this.top = top;
//    }

    public T getBase() {
        return valorInicial;
    }

    public void setBase(T base) {
        this.valorInicial = base;
    }

    public Nodo<T> getSig() {
        return sig;
    }

    public void setSig(Nodo<T> sig) {
        this.sig = sig;
    }
   

    
}
