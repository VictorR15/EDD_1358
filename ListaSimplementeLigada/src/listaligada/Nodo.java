
package listaligada;

/**
 *
 * @author victo
 */
public class Nodo <T> {

     T dato;
     Nodo<T> sig;

    /*ESTE CONSTRUCTOR SIRVE SOLO PARA CREAR UN NODO, EN DONDE EL SIG NO APUNTA 
    A NADA. SOLO SE CREA UN NODO Y YA, YA QUE NO PIDE UN SEGUNDO ARGUMENTO PARA
    APUNTAR AL ATRIBUTO SIG, O SEA A OTRO NODO
    */

    public Nodo(T dato) {
        
        this.dato = dato;
        this.sig = null;
        
    }
    
    /*ESTE CONSTRUCTOR SIRVE PARA CREAR UN NODO PERO TAMBIEN CREA UN NODO 
    QUE ESTA VACIO EN DONDE SE LE DEBE DE INGRESAR UN ARGUMENTO PARA EL SIGUIENTE
    NODO
    */
    

    public Nodo(T dato, Nodo<T> sig) {
        this.dato = dato;
        this.sig = sig;
    }
    
    
    
    
    
}
