package lab;

/**
 *
 * @author victo
 */
public class Laberinto {

    //CREAMOS EL LABERINTO 
    
    public char tabla[][] = {
        {'#','#','#','#','#','#','#','#','#','#'},
        {'#', ' ', '#', ' ', '#', ' ', '#', ' ', '#', '#',},
        {'#', ' ', '#', ' ', '#', ' ', '#', ' ', '#', '#',},
        {'#', ' ', '#', ' ', '#', ' ', ' ', ' ', ' ', '#',},
        {'#', ' ', ' ', ' ', '#', ' ', '#', '#', ' ', '#',},
        {'#', '#', '#', ' ', '#', ' ', '#', '#', ' ', '#',},
        {'#', '#', '#', ' ', ' ', ' ', '#', '#', 'F', '#',},
        {'#','#','#','#','#','#','#','#','#','#'},
    };
    
    
    //IMPRIMIMIMOS EL LABERINTO
    
    public void imprimirTabla(){
        
        
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {

                System.out.print(tabla[i][j] + " ");

            }
            System.out.println("");

        }
        
    }
    
    //BUSCAMOS EL CAMINO PARA  LLEGAR AL FINAL "F"
    
    public boolean camino(){
        boolean camino = true;
        
        return camino;
    }
    
    
    

    
    
    
    

}
