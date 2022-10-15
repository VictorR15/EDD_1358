package pilas;

/**
 *
 * @author victo
 */
public class Nodo<T> {

    private T ultimoValor;
    private Nodo<T> sig;

    public Nodo(T _UltimoValor) {
        this.ultimoValor = _UltimoValor;
    }

    //CONSTRUCTOR PARA DECLAR LA BASE 
    public Nodo(T _UltimoValor, Nodo<T> _sig) {
        this.ultimoValor = _UltimoValor;
        this.sig = _sig;
    }

    public T getUltimoValor() {
        return ultimoValor;
    }

    public void setUltimoValor(T valorInicial) {
        this.ultimoValor = valorInicial;
    }

    public Nodo<T> getSig() {
        return sig;
    }

    public void setSig(Nodo<T> sig) {
        this.sig = sig;
    }

    @Override
    public String toString() {
        return ultimoValor + "\n";
    }
    
    

}
