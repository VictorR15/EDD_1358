package pilas;

/**
 *
 * @author victo
 */
public class Pilas<T> {

    private Nodo<T> ultimoValor;
    int tamanio = 0;
    

    //CHECA SI ESTA VACIA
    public boolean isEmpty() {
        return this.ultimoValor == null;
    }

    //MUESTRA LA LONGITUD DE LA PILA 
    public void length() {

        Nodo pilaCopia = this.ultimoValor;
        int contador = 0;

        while (pilaCopia.getTop() != null) {

            pilaCopia = pilaCopia.getTop();
            contador++;

        }

        System.out.println("Longitud de la pila: " + contador);

    }

    //MUESTRA EL TOP SIN ELIMINARLO
    public void peek() {

        Nodo pilaCopia = this.ultimoValor;

        while (pilaCopia.getTop() != null) {

            pilaCopia = pilaCopia.getTop();

        }

        System.out.println(pilaCopia);

    }

    //INGRESA UN VALOR NUEVO
    public void push(T value) {

        Nodo<T> pilaCopia = new Nodo(value);

        if (isEmpty()) {

            this.ultimoValor = pilaCopia;
        }
        else{
            
            Nodo<T> aux = this.ultimoValor;
            
            while (aux.getTop() != null) {                
                
                aux = aux.getTop();
                
            }
            
            this.ultimoValor = aux;
            
        }
    }

    //MUESTRA EL TOP E ELIMINA EL VALOR
    public void pop() {

        Nodo<T> pilaCopia = this.ultimoValor;
        Nodo<T> aux = this.ultimoValor;

        while (aux.getTop() != null) {

            aux = aux.getTop();

        }

        pilaCopia = aux;

        System.out.println("" + pilaCopia);

    }

}
