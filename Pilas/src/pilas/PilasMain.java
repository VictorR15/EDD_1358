package pilas;

import java.util.Stack;

/**
 *
 * @author victo
 */
public class PilasMain {

    public static void main(String[] args) {

        Pilas<String> pila1 = new Pilas();
//        Stack<String> pila2 = new Stack<>();

        pila1.push("V");
        pila1.push("I");
        pila1.push("C");
        pila1.push("T");
        pila1.push("O");
        pila1.push("R");
        System.out.println("-------------------");

        pila1.peek();
        System.out.println("-------------------");

        pila1.pop();
        System.out.println("-------------------");

        pila1.pop();
        System.out.println("-------------------");

        pila1.length();
        System.out.println("-------------------");

        System.out.println(pila1.toStringPila());

//        pila1.peek();
//        
//        System.out.println("---------------------");
//        
//        pila2.push("V");
//        pila2.push("I");
//        pila2.push("C");
//        pila2.push("T");
//        pila2.push("O");
//        pila2.push("R");
//        
////        pila2.pop();
//        pila2.toString();
//        
//        System.out.println(""+pila2);
    }

}
