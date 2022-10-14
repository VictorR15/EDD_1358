package pilas;

/**
 *
 * @author victo
 */
public class Pilas<T> {

    Nodo<T> listaPila;
    int tamanio;

    public Pilas() {
        this.listaPila = null;
        this.tamanio = 0;
    }

    //CHECA SI ESTA VACIA
    public boolean isEmpty() {

        return this.listaPila == null;
    }

    //
    public void vaciar() {

        this.listaPila = null;
        this.tamanio = 0;

    }

    //LONGITUD DE LA PILA
    public int length() {

        System.out.println("" + tamanio);
        return this.tamanio;
    }

    //INGRESA UN VALOR NUEVO
    public void push(T value) {

    }

    //MUESTRA EL TOP Y LO ELIMINA EL VALOR
    public void pop() {

    }

    //MUESTRA EL TOP SIN ELIMINARLO
    public void peek() {

    }

}
