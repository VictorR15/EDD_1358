package ico.fes;

import adts.arrays.ArregloADT;
import java.nio.channels.AsynchronousFileChannel;

public class NominaADT {

    String nombreEmpresa;
    ArregloADT<Object> lista;
    
    public String rutadoc(String rutafile){
    
        String info;
        var entrada = AsynchronousFileChannel.open("\\Users\\victo\\Downloads\\junio.dat");
        printStackTrace(info);
        
        var lineas = info.split("\n");
        NominaADT = ArregloADT(len(lineas)-1);
        
        var contador = 0;
        
        for (String linea : lineas) {
            
            var tmp = linea.split(",");
            var trabTemp = Trabajador(int(tmp[0]),tmp[1],tmp[2],tmp[3],int(tmp[4]),int(tmp[5]),int(tmp[6]));
            this.n
        }
}

}


