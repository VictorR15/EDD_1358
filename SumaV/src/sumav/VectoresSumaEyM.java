
package sumav;


import java.util.Scanner;

/**
 *
 * @author Contreras Carrillo Juan David
 */
public class VectoresSumaEyM {
    
    double Ax,Ay,Bx,By,Cx,Cy;
    double Ma,Mb,Mc;
    double Ag,Bg,Cg;
    double X,Y,R,D,d;
    int Sc,Sb,Sa,vec;
    
    Scanner tc=new Scanner(System.in);
    
    
    public void Datos(){
        
        System.out.println("Electricidad y Magnetismo Grupo: 1307");
        System.out.println("Profesor: Alejandro Suarez Herrera");
        System.out.println("Programa para sumar dos o tres vectores");
        System.out.println("Elaborado por:");
        System.out.println("Victor Manuel Ramirez Martinez");
        
        
        System.out.print("Ingrese la cantidad de vectores: ");
        vec=tc.nextInt();
        
    if(vec<4&&vec>1){    
       if(vec==2){
           Ingresar();
        System.out.print("Magnitud A: ");
        Ma=tc.nextDouble();
        System.out.print("Direccion A: ");
        Ag=tc.nextDouble();
        System.out.print("Sentido A: ");
        Sa=tc.nextInt();
       
        System.out.print("Magnitud B: ");
        Mb=tc.nextDouble();
        System.out.print("Direccion B: ");
        Bg=tc.nextDouble();
        System.out.print("Sentido B: ");
        Sb=tc.nextInt();
        
        Calcular1();
       } 
       
       if(vec==3){
         Ingresar();
        System.out.print("Magnitud A: ");
        Ma=tc.nextDouble();
        System.out.print("Direccion A: ");
        Ag=tc.nextDouble();
        System.out.print("Sentido A: ");
        Sa=tc.nextInt();
       
        System.out.print("Magnitud B: ");
        Mb=tc.nextDouble();
        System.out.print("Direccion B: ");
        Bg=tc.nextDouble();
        System.out.print("Sentido B: ");
        Sb=tc.nextInt();
        
        System.out.print("Magnitud C: ");
        Mc=tc.nextDouble();
        System.out.print("Direccion C: ");
        Cg=tc.nextDouble();
        System.out.print("Sentido C: ");
        Sc=tc.nextInt();
        
        Calcular2();
       }
    }else{
        System.out.println("");
    }
   }
    
    
    
    
    
    public void Ingresar(){
        
        System.out.println("Por favor ingrese la Magnitud, la Direccion y el Sentido de cada vector");
        System.out.println("para el sentido escoja un numero entre el 1 y el 4");
        System.out.println("tomando en cuenta la siguiente imagen:");
        
        
        System.out.println("             N");
        System.out.println("             |");
        System.out.println("             |");
        System.out.println("      [1]    |    [2]" );
        System.out.println("             |");
        System.out.println("O------------+------------E");
        System.out.println("             |");
        System.out.println("      [3]    |    [4]" );
        System.out.println("             |");
        System.out.println("             |");
        System.out.println("             S");
        
        System.out.println("");
    }
    
    
    
    public void Calcular1(){
        double radiansa = Math.toRadians(Ag);
        double cosValuea = Math.cos(radiansa);
        double sinValuea = Math.sin(radiansa);
        
        
        double radiansb = Math.toRadians(Bg);
        double cosValueb = Math.cos(radiansb);
        double sinValueb = Math.sin(radiansb);
    
        
        if(Sa==1){
          Ax=-1*Ma*cosValuea;
          Ay=Ma*sinValuea;
        }
        if(Sa==2){
          Ax=Ma*cosValuea;
          Ay=Ma*sinValuea;
        }
        if(Sa==3){
          Ax=-1*Ma*cosValuea;
          Ay=-1*Ma*sinValuea;
        }
        if(Sa==4){
          Ax=Ma*cosValuea;
          Ay=-1*Ma*sinValuea;     
        }
        
        
        if(Sb==1){
          Bx=-1*Mb*cosValueb;
          By=Mb*sinValueb;
        }
        if(Sb==2){
          Bx=Mb*cosValueb;
          By=Mb*sinValueb;
        }
        if(Sb==3){
          Bx=-1*Mb*cosValueb;
          By=-1*Mb*sinValueb;
        }
        if(Sb==4){
          Bx=Mb*cosValueb;
          By=-1*Mb*sinValueb;
        }
        
            X=Ax+Bx;
            Y=Ay+By;
        
        
        R=Math.sqrt(Math.pow(X,2)+Math.pow(Y,2));
        
        d=(Y/X);
        
        
        double arcotangente=Math.atan(d);
        double arctan=Math.toDegrees(arcotangente);
        
        D=arctan;
        
        Mostrar();
    }
    
    
    
    
    public void Calcular2(){
        
        double radiansa = Math.toRadians(Ag);
        double cosValuea = Math.cos(radiansa);
        double sinValuea = Math.sin(radiansa);
        
        
        double radiansb = Math.toRadians(Bg);
        double cosValueb = Math.cos(radiansb);
        double sinValueb = Math.sin(radiansb);
        
        
        double radiansc = Math.toRadians(Cg);
        double cosValuec = Math.cos(radiansc);
        double sinValuec = Math.sin(radiansc);
        
        
        if(Sa==1){
          Ax=-1*Ma*cosValuea;
          Ay=Ma*sinValuea;
        }
        if(Sa==2){
          Ax=Ma*cosValuea;
          Ay=Ma*sinValuea;
        }
        if(Sa==3){
          Ax=-1*Ma*cosValuea;
          Ay=-1*Ma*sinValuea;
        }
        if(Sa==4){
          Ax=Ma*cosValuea;
          Ay=-1*Ma*sinValuea;     
        }
        
        
        if(Sb==1){
          Bx=-1*Mb*cosValueb;
          By=Mb*sinValueb;
        }
        if(Sb==2){
          Bx=Mb*cosValueb;
          By=Mb*sinValueb;
        }
        if(Sb==3){
          Bx=-1*Mb*cosValueb;
          By=-1*Mb*sinValueb;
        }
        if(Sb==4){
          Bx=Mb*cosValueb;
          By=-1*Mb*sinValueb;
        }
        
        if(Sc==1){
          Cx=-1*Mc*cosValuea;
          Cy=Mc*sinValuea;
        }
        if(Sc==2){
          Cx=Mc*cosValuec;
          Cy=Mc*sinValuec;
        }
        if(Sc==3){
          Cx=-1*Mc*cosValuec;
          Cy=-1*Mc*sinValuec;
        }
        if(Sc==4){
          Cx=Mc*cosValuec;
          Cy=-1*Mc*sinValuec;
        }
        
        
            X=Ax+Bx+Cx;
            Y=Ay+By+Cy;
        
        
        R=Math.sqrt(Math.pow(X,2)+Math.pow(Y,2));
        
        
        
        d=(Y/X);
        double arcotangente=Math.atan(d);
        double arctan=Math.toDegrees(arcotangente);
        D=arctan;
  
        Mostrar();
    }
// 3, 30, 2, 4, 73, 2
    
    public void Mostrar(){
        System.out.println("---------------------------------------------------------------");
        
        if(vec==3)
        {
         System.out.println("Primero se obtienen los componentes en x e y de los tres vectores");
         System.out.printf("Componente Ax = %.2f %n",Ax);
         System.out.printf("Componente AY = %.2f %n",Ay);
         System.out.printf("Componente Bx = %.2f %n",Bx);
         System.out.printf("Componente By = %.2f %n",By);
         System.out.printf("Componente Cx = %.2f %n",Cx);
         System.out.printf("Componente Cy = %.2f %n",Cy);
        }
        
        if(vec==2)
        {
         System.out.println("Primero se obtienen los componentes en x e y de los dos vectores");
         System.out.printf("Componente Ax = %.2f %n",Ax);
         System.out.printf("Componente AY = %.2f %n",Ay);
         System.out.printf("Componente Bx = %.2f %n",Bx);
         System.out.printf("Componente By = %.2f %n",By);
        }
        System.out.println("---------------------------------------------------------------");
        System.out.println("Despues se realiza una suma de los componentes x e y");
         System.out.printf("Ex = %.2f %n",X);
         System.out.printf("EY = %.2f %n",Y);
        System.out.println("---------------------------------------------------------------");
        System.out.println("Por ultimo encontramos la fuerza resultante y su direccion");
         System.out.printf("R = %.2f %n",R);
         System.out.printf("D = %.2f %n",D);
        System.out.println("---------------------------------------------------------------");
        
    }

     public static void main(String args[]) {
       VectoresSumaEyM objeto1= new VectoresSumaEyM();
        objeto1.Datos();
            }
}
