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
            int direccion1X, direccion1Y, direccion2X, direccion2Y;
            double gradosVec1, gradosVec2, magnitudVec1X, magnitudVec1Y, magnitudVec2X, magnitudVec2Y, componetesX1, componetesX2, componentesY1, componentesY2, sumatoriaDeLosComponentesX, sumatoriaDeLosComponentesY, resultante,gradosResultado,grados1,grados2;


            Console.WriteLine("SUMA DE VECTORES");
            Console.WriteLine();

            
            //PREGUNTAMOS LAS VARIABLES AL USUARIO

            Console.Write("Dame la magnitud del primer vector: ");
            magnitudVec1X = Convert.ToDouble(Console.ReadLine());
            //LE ASIGNAMOS EL MISMO VALOR A UNA VARIABLE EN Y
            magnitudVec1Y = magnitudVec1X;
            Console.Write("Dame los grados de vector: ");
            grados1 = Convert.ToDouble(Console.ReadLine());

            Console.Write("Dame la magnitud del segundo vector: ");
            magnitudVec2X = Convert.ToDouble(Console.ReadLine());
            //LE ASIGNAMOS EL MISMO VALOR A UNA VARIABLE EN Y
            magnitudVec2Y = magnitudVec2X;
            Console.Write("Dame los grados del vector: ");
            grados2 = Convert.ToDouble(Console.ReadLine());


            /*PREGUNTAMOS EN QUE DIRECCION ESTA APUNTANDO LOS VECTORES Y SI CAMBIARLES EL SIGNO
             * EN EL CASO DE QUE ESTE SEA NEGATIVO
             */



            //Console.WriteLine("");
            //Console.WriteLine("¿El vector es positivo con respecto al eje de las X? ");
            //Console.WriteLine("SI: 1        NO:0");
            //direccion1X = Convert.ToInt32(Console.ReadLine());
            //if (direccion1X == 0)
            //{
            //    magnitudVec1X = magnitudVec1X * -1;
            //}

            //Console.WriteLine("");
            //Console.WriteLine("¿El vector es positivo con respecto al ejej de las Y? ");
            //Console.WriteLine("SI: 1        NO:0");
            //direccion1Y = Convert.ToInt32(Console.ReadLine());
            //if (direccion1Y == 0)
            //{
            //    magnitudVec1Y = magnitudVec1Y * -1;
            //}
            //Console.WriteLine("");

            //MOSTRAMOS LOS COMPONENTES DE DEL PRIMER VECTOR CON RESPECTO A "X" Y "Y"

            componetesX1 = Math.Cos(grados1 * Math.PI / 180) * magnitudVec1X;
            Console.WriteLine("Componente del primer vector con respecto a X: {0}", componetesX1);
            componentesY1 = Math.Sin(grados1 * Math.PI / 180) * magnitudVec1Y;
            Console.WriteLine("Componente del primer vector con respecto a Y: {0}", componentesY1);


            /*PREGUNTAMOS EN QUE DIRECCION ESTA APUNTANDO LOS VECTORES Y SI CAMBIARLES EL SIGNO
             * EN EL CASO DE QUE ESTE SEA NEGATIVO
             */
            //Console.WriteLine("");
            //Console.WriteLine("¿El vector es positivo con respecto al eje de las X? ");
            //Console.WriteLine("SI: 1        NO:0");
            //direccion2X = Convert.ToInt32(Console.ReadLine());
            //if (direccion2X == 0)
            //{
            //    magnitudVec2X = magnitudVec2X * -1;
            //}
            //Console.WriteLine("");
            //Console.WriteLine("¿El vector es positivo con respecto al ejej de las Y? ");
            //Console.WriteLine("SI: 1        NO:0");
            //direccion2Y = Convert.ToInt32(Console.ReadLine());
            //if (direccion2Y == 0)
            //{
            //    magnitudVec2Y = magnitudVec2Y * -1;
            //}
            Console.WriteLine("");
            //MOSTRAMOS LOS COMPONENTES DE DEL SEGUNDO VECTOR CON RESPECTO A "X" Y "Y"
            componetesX2 = Math.Cos(grados2 * Math.PI / 180) * magnitudVec2X;
            Console.WriteLine("Componente del primer vector con respecto a X: {0}", componetesX2);
            componentesY2 = Math.Sin(grados2 * Math.PI / 180) * magnitudVec2Y;
            Console.WriteLine("Componente del primer vector con respecto a X: {0}", componentesY2);


            //AHORA SACAMOS LA SUMATORIA DE LOS COMPONENTES 

            Console.WriteLine("");
            sumatoriaDeLosComponentesX = (componetesX1) + (componetesX2);
            Console.WriteLine("Sumatoria de los componentes en el eje de las X: {0}",sumatoriaDeLosComponentesX);
            sumatoriaDeLosComponentesY = (componentesY1) + (componentesY2);
            Console.WriteLine("Sumatoria de los componentes en el eje de las Y: {0}", sumatoriaDeLosComponentesY);


            //SACAMOS EL RESULTADO DE LA RESULTANTE Y LO IMPRIMIMOS

            Console.WriteLine("");
            resultante = Math.Sqrt((Math.Pow(sumatoriaDeLosComponentesX, 2) + (Math.Pow(sumatoriaDeLosComponentesY, 2))));
            Console.WriteLine("La resultante: {0}",resultante);


            //SACAMOS EL RESULTADO DEL ANGULO Y LO IMPRIMIMOS 

            Console.WriteLine("");
            gradosResultado = Math.Atan((sumatoriaDeLosComponentesY/sumatoriaDeLosComponentesX)) * (180 / Math.PI);
            Console.WriteLine("Los grados: {0}",gradosResultado);
            Console.WriteLine("");


            
            

                if (sumatoriaDeLosComponentesX > 1)
                {
                    Console.Write("→");
                }
                else
                {
                    Console.Write("←");
                }
            
            if(sumatoriaDeLosComponentesY > 1)
            {
                Console.Write("↑");
            }
            else
            {
                Console.Write("↓");
            }
            Console.WriteLine("");
            Console.WriteLine("");

            Console.WriteLine("Victor Manuel Ramirez Martinez");
            Console.WriteLine("");
            Console.WriteLine("");
















        }
    }
}
