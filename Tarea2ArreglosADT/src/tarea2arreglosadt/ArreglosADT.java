/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea2arreglosadt;

/**
 *
 * @author victo
 */
public class ArreglosADT {
    
    private int tam = 0; 
    private int indice;
    private int valor = 0;
    

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
    
    public void arregloADT(int tamanio){
        this.tam = tamanio;
        
    }

    public void setElemento(int indice,int valor){
        indice = 5;
        valor = 9;
    }
    
    public void setIndice(int indice){
        this.indice = indice;
    }

    public int getIndice(){
        return indice;
    }
    
    
    public void limpiar (){
         
        this.valor = 0;
    }
    
    
    
    
}
