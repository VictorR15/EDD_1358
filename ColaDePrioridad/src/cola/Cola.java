package cola;

/**
 *
 * @author victo
 */
public class Cola <T>{

    Nodo<T>[] datoCola;

    public Cola() {
    }

    public Cola(Nodo<T>[] datoCola) {
        this.datoCola = datoCola;
    }
    
    public boolean is_empty(){
        
        return this.datoCola == null;
    }
    
    
    
    

    
    
    
    
 
    
    
}
