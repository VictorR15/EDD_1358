package pilas;

/**
 *
 * @author victo
 */
public class PilasMain {

    public static void main(String[] args) {
        
        Pilas<String> pila1 = new Pilas<>();
        
        pila1.push("V");
        pila1.push("I");
        pila1.push("C");
        pila1.push("T");
        pila1.push("O");
        pila1.push("R");
        
        pila1.pop();
        pila1.pop();
        pila1.length();
        
        
        
    }
    
}
