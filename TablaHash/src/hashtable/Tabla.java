package hashtable;

/**
 *
 * @author victo
 */
public class Tabla {
    
    public static void main(String[] args) {
        
         HashTable.tamanio = 20;
        
        HashTable [] tabla = new HashTable[HashTable.tamanio];
        
        HashTable dato = new HashTable(1654651, "Jose");
        dato = new HashTable(886531, "Manuel");
        dato = new HashTable(4641625, "Pepa");
        System.out.println(dato);
        
        
    }
    
}
