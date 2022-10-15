package pilas;

/**
 *
 * @author victo
 */
public class Pilas<T> {

    Nodo<T> top;
    int tamanio;

    public Pilas() {
        this.top = null;
        this.tamanio = 0;
    }

    //CHECA SI ESTA VACIA
    public boolean isEmpty() {

        return this.top == null;
    }

    //
    public void vaciar() {

        this.top = null;
        this.tamanio = 0;

    }

    //LONGITUD DE LA PILA
    public int length() {

        System.out.println("" + tamanio);
        return this.tamanio;
    }

    //MUESTRA EL TOP SIN ELIMINARLO
    public T peek() {

        if (isEmpty()) {
            return null;

        } else {

            System.out.println("" + top);
            return top.getUltimoValor();

        }

    }

    //MUESTRA EL TOP Y LO ELIMINA EL VALOR
    public T pop() {

        if (isEmpty()) {
            return null;

        } else {

            T elemento = this.top.getUltimoValor();
            Nodo<T> aux = this.top.getSig();
            this.top = null;
            this.top = aux;
            this.tamanio--;
            this.top.toString();

            System.out.println("" + elemento);
            return elemento;

        }

    }

    //INGRESA UN VALOR NUEVO
    public void push(T value) {

        Nodo<T> nuevoValor = new Nodo<>(value, this.top);

        this.top = nuevoValor;
        this.tamanio++;

    }

    public String toStringPila() {
        if (isEmpty()) {
            String vacia = "La pila esta vacia";
            return vacia;

        } else {

            Nodo<T> aux = this.top;
            String resultado = "";

            while (aux != null) {

                resultado += aux.toString();
                aux = aux.getSig();
            }

            return resultado;
        }

    }

}
