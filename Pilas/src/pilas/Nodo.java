package pilas;

/**
 *
 * @author victo
 */
public class Nodo<T> {

    T base;
    Nodo<T> sig;

//    public Nodo() {
//    }

    //CONSTRUCTOR PARA DECLAR LA BASE 
    
    public Nodo(T base, Nodo<T> sig) {
        this.base = base;
        this.sig = sig;
    }
    

//    CONSTRUCTOR PARA CREAR UN NUEVO TOP
//    public Nodo(T base, Nodo<T> top) {
//        this.base = base;
//        this.top = top;
//    }
//    public T getBase() {
//        return base;
//    }
//
//    public void setBase(T base) {
//        this.base = base;
//    }
//
//    public Nodo<T> getTop() {
//        return top;
//    }
//
//    public void setTop(Nodo<T> top) {
//        this.top = top;
//    }
//
//    @Override
//    public String toString() {
//        return "|"+base+"|";
//    }

    
}
