/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Clases.Triangulo;
import java.util.Scanner;

/**
 *
 * @author Programación
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);        
        
        Triangulo obj1 = new Triangulo();
        
        System.out.printf("Digite el valor de LadoA: ");
        obj1.SetLadoA(entrada.nextDouble());
        System.out.printf("Digite el valor de LadoB: ");
        obj1.SetLadoB(entrada.nextDouble());
        System.out.printf("Digite el valor de Base: ");
        obj1.SetBase(entrada.nextDouble());
        
        System.out.printf("\n*******************************************\n");
        System.out.printf("\nLas medidas de mi triangulo son\n");
        System.out.printf("Lado A: %1.0f\nLado B: %1.0f\nBase: %1.0f\n",
                obj1.GetLadoA(),obj1.GetLadoB(),obj1.GetBase());
        System.out.printf("*******************************************\n");
        
       System.out.printf ("\nMi triangulo es de tipo: %s%s%s",
                obj1.TrianguloEquilatero(obj1.GetLadoA(), obj1.GetLadoB(), obj1.GetBase()),
                obj1.TrianguloIsoseles(obj1.GetLadoA(), obj1.GetLadoB(), obj1.GetBase()),
                obj1.TrianguloEscaleno(obj1.GetLadoA(), obj1.GetLadoB(), obj1.GetBase()));        

    }
    
}
