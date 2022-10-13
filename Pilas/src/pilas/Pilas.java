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

        Nodo nuevoValor = new Nodo(value);
//        this.listaPila = nuevoValor;

        this.listaPila = nuevoValor;

//        if (this.isEmpty()) {
//
//            this.listaPila = nuevoValor;
//
//        } else {
//
//            
////            Nodo aux = this.listaPila;
////            
////            while(aux.getTop() != null){
////                
////                aux = aux.getTop();
////                
////            }
////
////            aux.setTop(nuevoValor);
////            this.listaPila = aux;
//
//        }
        tamanio++;
    }

    //MUESTRA EL TOP E ELIMINA EL VALOR
    public T pop() {

        if (this.isEmpty()) {

            T base = this.listaPila.base;
            this.listaPila = base.top;

            return base;
        }

        tamanio--;

    }

    //MUESTRA EL TOP SIN ELIMINARLO
    public void peek() {

        Nodo pilaCopia = this.listaPila;

//        while (pilaCopia.getTop() != null) {
//
//            pilaCopia = pilaCopia.getTop();
//
//        }
        System.out.println(pilaCopia);

    }

}
