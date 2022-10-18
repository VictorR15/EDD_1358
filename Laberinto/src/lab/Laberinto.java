package lab;

/**
 *
 * @author victo
 */
public class Laberinto {

    //CREAMOS EL LABERINTO 
    public char tabla[][] = {
        {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
        {'#', ' ', '#', ' ', '#', ' ', '#', ' ', '#', '#',},
        {'#', ' ', '#', ' ', '#', ' ', '#', ' ', '#', '#',},
        {'#', ' ', '#', ' ', '#', ' ', ' ', ' ', ' ', '#',},
        {'#', ' ', ' ', ' ', '#', ' ', '#', '#', ' ', '#',},
        {'#', '#', '#', ' ', '#', ' ', '#', '#', ' ', '#',},
        {'#', '#', '#', ' ', ' ', ' ', '#', '#', 'F', '#',},
        {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},};

    //IMPRIMIMIMOS EL LABERINTO
    public void imprimirTabla() {

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {

                System.out.print(tabla[i][j] + " ");

            }
            System.out.println("");

        }

    }

    //BUSCAMOS EL CAMINO PARA  LLEGAR AL FINAL "F"
    public boolean caminoSalida(int x, int y) {

        if (tabla[x][y] == 'F') {

            return true;
        }
        if (tabla[x][y] == '#' || tabla[x][y] == '1') {

            return false;
        }

        tabla[x][y] = '1';
        imprimirTabla();
        boolean camino;
        camino = caminoSalida(x, y + 1);

        if (camino) {
            return true;
        }
        camino = caminoSalida(x - 1, y);

        if (camino) {
            return true;
        }
        camino = caminoSalida(x, y - 1);

        if (camino) {
            return true;
        }
        camino = caminoSalida(x + 1, y);

        if (camino) {
            return true;
        }

        tabla[x][y] = ' ';
        imprimirTabla();
        return false;

    }

}
