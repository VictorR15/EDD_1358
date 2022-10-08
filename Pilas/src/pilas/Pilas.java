package pilas;

/**
 *
 * @author victo
 */
public class Pilas<T> {

    Nodo<T> base;

    public Pilas() {
    }

    public Pilas(Nodo<T> base) {
        this.base = base;
    }

    public boolean isEmpty() {
        return this.base == null;
    }

    public void length() {

        Nodo pilaCopia = this.base;

        while (pilaCopia.getTop() != null) {

            System.out.println(pilaCopia);
            pilaCopia = pilaCopia.getTop();

        }
        System.out.println(pilaCopia);

    }

    public void peek() {

        Nodo pilaCopia = this.base;

        while (pilaCopia.getTop() != null) {

            pilaCopia = pilaCopia.getTop();

        }

        System.out.println(pilaCopia);

    }

    public void pop() {

    }

    public void push(T value) {

    }

}
