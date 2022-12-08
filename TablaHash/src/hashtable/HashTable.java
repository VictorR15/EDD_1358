package hashtable;

/**
 *
 * @author victo
 */
public class HashTable {
    
    private int key;
    private String nombre;
    public static int tamanio;

    public HashTable() {
    }

    public HashTable(int key, String nombre) {
        this.key = key;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "HashTable{" + "key=" + key + ", nombre=" + nombre + '}';
    }
    
    public int valueOf(){
        return this.key;
    }
    public void remove (int key){
        
        this.key = key;
        this.key = 0;
        
    }
    
    
    
}
