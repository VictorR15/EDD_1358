package test;

public class TestTabla {

    public static void main(String[] args) {

//        Deberán diseñar el algoritmo que determine si una celda esta viva o muerta mediante las siguientes reglas:
//          1.- Si una célula está viva y tiene dos o tres vecinos vivos, la célula permanece viva en la siguiente
//          generación. Los vecinos son las ocho celdas que rodean inmediatamente una celda: vertical, horizontal y diagonalmente.
//
//          2.- Si una célula viva que no tiene vecinos vivos o un solo vecino vivo muere por aislamiento en la próxima generación.
//
//          3.- Una célula viva que tiene cuatro o más vecinos vivos muere por sobrepoblación en la próxima generación.
//
//          4.- Una celda muerta con exactamente tres vecinos vivos da como resultado un nacimiento y cobra vida en la siguiente generación. 
//          Todas las demás células muertas permanecen muertas en la próxima generación.
        String tabla[][] = new String[12][12];

        int contador = 0;

        tabla[0][0] = "";
        tabla[1][0] = "";
        tabla[2][0] = "";
        tabla[3][0] = "";
        tabla[4][0] = "";
        tabla[5][0] = "";
        tabla[6][0] = "";
        tabla[7][0] = "";
        tabla[8][0] = "";
        tabla[9][0] = "";
        tabla[10][0] = "";
        tabla[11][0] = "";

        tabla[0][1] = "";
        tabla[1][1] = "M";
        tabla[2][1] = "V";
        tabla[3][1] = "V";
        tabla[4][1] = "M";
        tabla[5][1] = "V";
        tabla[6][1] = "V";
        tabla[7][1] = "M";
        tabla[8][1] = "V";
        tabla[9][1] = "V";
        tabla[10][1] = "M";
        tabla[11][1] = "";

        tabla[0][2] = "";
        tabla[1][2] = "V";
        tabla[2][2] = "V";
        tabla[3][2] = "V";
        tabla[4][2] = "M";
        tabla[5][2] = "M";
        tabla[6][2] = "M";
        tabla[7][2] = "M";
        tabla[8][2] = "M";
        tabla[9][2] = "V";
        tabla[10][2] = "V";
        tabla[11][2] = "";

        tabla[0][3] = "";
        tabla[1][3] = "V";
        tabla[2][3] = "M";
        tabla[3][3] = "M";
        tabla[4][3] = "M";
        tabla[5][3] = "V";
        tabla[6][3] = "V";
        tabla[7][3] = "V";
        tabla[8][3] = "V";
        tabla[9][3] = "V";
        tabla[10][3] = "M";
        tabla[11][3] = "";

        tabla[0][4] = "";
        tabla[1][4] = "V";
        tabla[2][4] = "V";
        tabla[3][4] = "V";
        tabla[4][4] = "M";
        tabla[5][4] = "V";
        tabla[6][4] = "V";
        tabla[7][4] = "V";
        tabla[8][4] = "M";
        tabla[9][4] = "M";
        tabla[10][4] = "V";
        tabla[11][4] = "";

        tabla[0][5] = "";
        tabla[1][5] = "V";
        tabla[2][5] = "V";
        tabla[3][5] = "M";
        tabla[4][5] = "V";
        tabla[5][5] = "V";
        tabla[6][5] = "V";
        tabla[7][5] = "M";
        tabla[8][5] = "V";
        tabla[9][5] = "V";
        tabla[10][5] = "M";
        tabla[11][5] = "";

        tabla[0][6] = "";
        tabla[1][6] = "V";
        tabla[2][6] = "M";
        tabla[3][6] = "V";
        tabla[4][6] = "V";
        tabla[5][6] = "M";
        tabla[6][6] = "V";
        tabla[7][6] = "V";
        tabla[8][6] = "M";
        tabla[9][6] = "M";
        tabla[10][6] = "M";
        tabla[11][6] = "";

        tabla[0][7] = "";
        tabla[1][7] = "V";
        tabla[2][7] = "M";
        tabla[3][7] = "M";
        tabla[4][7] = "V";
        tabla[5][7] = "V";
        tabla[6][7] = "V";
        tabla[7][7] = "V";
        tabla[8][7] = "M";
        tabla[9][7] = "M";
        tabla[10][7] = "V";
        tabla[11][7] = "";

        tabla[0][8] = "";
        tabla[1][8] = "M";
        tabla[2][8] = "V";
        tabla[3][8] = "V";
        tabla[4][8] = "V";
        tabla[5][8] = "V";
        tabla[6][8] = "M";
        tabla[7][8] = "V";
        tabla[8][8] = "V";
        tabla[9][8] = "V";
        tabla[10][8] = "M";
        tabla[11][8] = "";

        tabla[0][9] = "";
        tabla[1][9] = "V";
        tabla[2][9] = "V";
        tabla[3][9] = "V";
        tabla[4][9] = "M";
        tabla[5][9] = "V";
        tabla[6][9] = "V";
        tabla[7][9] = "M";
        tabla[8][9] = "V";
        tabla[9][9] = "V";
        tabla[10][9] = "M";
        tabla[11][9] = "";

        tabla[0][10] = "";
        tabla[1][10] = "V";
        tabla[2][10] = "M";
        tabla[3][10] = "V";
        tabla[4][10] = "V";
        tabla[5][10] = "M";
        tabla[6][10] = "M";
        tabla[7][10] = "M";
        tabla[8][10] = "V";
        tabla[9][10] = "V";
        tabla[10][10] = "M";
        tabla[11][10] = "";

        tabla[0][11] = "";
        tabla[1][11] = "";
        tabla[2][11] = "";
        tabla[3][11] = "";
        tabla[4][11] = "";
        tabla[5][11] = "";
        tabla[6][11] = "";
        tabla[7][11] = "";
        tabla[8][11] = "";
        tabla[9][11] = "";
        tabla[10][11] = "";
        tabla[11][11] = "";

        //String[][] tablaBucle = new String[12][12];
        //tablaBucle = tabla;
        for (int i = 1; i < 11; i++) {

            System.out.println("Generacion " + i);
            //tablaBucle = tabla;

            for (int x = 1; x < 11; x++) {//FILAS
                System.out.println("");

                for (int y = 1; y < 11; y++) {//COLUMNAS
                    
                    System.out.print("\t" + tabla[x][y]);

                    if (tabla[x][y] == "V") {

                        if (tabla[x - 1][y + 1] == "V") {

                            contador = +1;

                        }
                        if (tabla[x][y + 1] == "V") {

                            contador = +1;

                        }
                        if (tabla[x + 1][y + 1] == "V") {

                            contador = contador + 1;

                        }
                        if (tabla[x - 1][y] == "V") {

                            contador = contador + 1;

                        }
                        if (tabla[x + 1][y] == "V") {

                            contador = contador + 1;

                        }
                        if (tabla[x - 1][y - 1] == "V") {

                            contador = contador + 1;

                        }
                        if (tabla[x][y - 1] == "V") {

                            contador = contador + 1;

                        }
                        if (tabla[x + 1][y + 1] == "V") {

                            contador = contador + 1;

                        }

                        if (contador <= 1) {
                            tabla[x][y] = "M";
                        } else {

                            if (contador == 3 || contador == 2) {
                                tabla[x][y] = "V";
                            } else {
                                if (contador <= 4) {
                                    tabla[x][y] = "M";
                                }
                            }

                        }

                    } else {
                        if (tabla[x][y] == "M") {
                            if (tabla[x - 1][y + 1] == "V") {

                                contador = contador + 1;

                            }
                            if (tabla[x][y + 1] == "V") {

                                contador = contador + 1;

                            }
                            if (tabla[x + 1][y + 1] == "V") {

                                contador = contador + 1;

                            }
                            if (tabla[x - 1][y] == "V") {

                                contador = contador + 1;

                            }
                            if (tabla[x + 1][y] == "V") {

                                contador = contador + 1;

                            }
                            if (tabla[x - 1][y - 1] == "V") {

                                contador = contador + 1;

                            }
                            if (tabla[x][y - 1] == "V") {

                                contador = contador + 1;

                            }
                            if (tabla[x + 1][y + 1] == "V") {

                                contador = contador + 1;

                            }

                        }

                        if (contador <= 3) {
                            tabla[x][y] = "V";

                        }
                    }

                }
            }
            System.out.println("");
            
            
        }

    }

//        tablaBucle = tabla;
//        
//        for (int i = 1; i < 11; i++) {
//            System.out.println("Generacion " + i);
//            for (int j = 1; j < 11; j++) {
//                
//                System.out.print("\t"+tablaBucle[i][j]);
//                
//            }
//            
//            System.out.println("");
//            
}
