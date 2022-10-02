using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Remoting.Contexts;
using System.Text;
using System.Threading.Tasks;

namespace sumaDeVectoresEyM
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int direccion1X , direccion1Y, direccion2X, direccion2Y ;
            double gradosVec1, gradosVec2, magnitudVec1, magnitudVec2, componetesX1, componetesX2, componentesY1, componentesY2,sumatoriaDeLosComponentesX, sumatoriaDeLosComponentesY;
            
            
            Console.WriteLine("SUMA DE VECTORES");
            Console.WriteLine();

            //Console.WriteLine("¿Cuantos vectores quieres sumar?");
            //numeroDeVectores = Convert.ToInt32(Console.ReadLine());

            //PREGUNTAMOS LAS VARIABLES AL USUARIO



            Console.Write("Dame la magnitud del primer vector: ");
            magnitudVec1 = Convert.ToDouble(Console.ReadLine());
            
            //Console.WriteLine("¿El vector apunta hacia la derecha?");
            //Console.WriteLine("SI: 1        NO:0");
            //direccion1 = Convert.ToInt32(Console.ReadLine());

            //if(direccion1 == 0)
            //{
            //    magnitudVec1 = magnitudVec1 * -1;
            //}
            
            Console.Write("Dame los grados de vector: ");
            gradosVec1 = Convert.ToDouble(Console.ReadLine());

            Console.Write("Dame la magnitud del segundo vector: ");
            magnitudVec2 = Convert.ToDouble(Console.ReadLine());
            //Console.WriteLine("¿El vector apunta hacia la derecha? ");
            //Console.WriteLine("SI: 1        NO:0");
            //direccion2 = Convert.ToInt32(Console.ReadLine());
            //if (direccion2 == 0)
            //{
            //    magnitudVec2 = magnitudVec2 * -1;
            //}

            Console.Write("Dame los grados del vector: ");
            gradosVec2 = Convert.ToDouble(Console.ReadLine());

            //SACAMOS LAS COMPONENTES EN "Y" Y "X"

            componetesX1 = Math.Cos(gradosVec1 * Math.PI / 180) * magnitudVec1;
            componentesY1 = Math.Sin(gradosVec1 * Math.PI / 180) * magnitudVec1;
            componetesX2 = Math.Cos(gradosVec2 * Math.PI / 180) * magnitudVec2;
            componentesY2 = Math.Sin(gradosVec2 * Math.PI / 180) * magnitudVec2;

            //AHORA SACAMOS LA SUMATORIA DE LOS COMPONENTES 

            sumatoriaDeLosComponentesX = (componetesX1) + (componetesX2);
            sumatoriaDeLosComponentesY = (componentesY1) + (componentesY2);

            

            Console.WriteLine(componetesX1);
            Console.WriteLine(componentesY1);
            Console.WriteLine(componetesX2);
            Console.WriteLine(componentesY2);
            Console.WriteLine(sumatoriaDeLosComponentesX);
            Console.WriteLine(sumatoriaDeLosComponentesY);











        }
    }
}
