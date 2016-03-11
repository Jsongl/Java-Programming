/*
 * Quiz 1 
 * Practica que contiene metodos. Esta hace uso de metodos para cada funcion.
 * JangSong Leung Ureña
 * Programacion 1 - Sabado 11am-2pm
 */
package determinador_triangulo;

import java.util.Scanner;

public class Determinador_Triangulo 
{
    public static void main(String[] args) 
    {
        int lado1, lado2, lado3;
        Scanner entrada = new Scanner (System.in);

        lado1 = CargarLado1();
        lado2 = CargarLado2();
        lado3 = CargarLado3();
        
        System.out.printf ("\nMi triangulo es de tipo: %s%s%s",
                TrianguloEquilatero(lado1,lado2,lado3),
                TrianguloIsoseles(lado1,lado2,lado3),
                TrianguloEscaleno(lado1,lado2,lado3));
       
    }
    
    private static int CargarLado1()
    {
        Scanner entrada = new Scanner (System.in);
        System.out.printf("Digite el lado 1: ");
        return (entrada.nextInt ());
    }
    
    private static int CargarLado2()
    {
        Scanner entrada = new Scanner (System.in);
        System.out.printf("Digite el lado 2: ");
        return (entrada.nextInt ());
    }
        
    private static int CargarLado3()
    {
        Scanner entrada = new Scanner (System.in);
        System.out.printf("Digite el lado 3: ");
        return (entrada.nextInt ());
    }
    
    private static String TrianguloEquilatero(int l1, int l2, int l3)
    {
        if (l1 == l2 && l2 == l3)
        {
            return "Equilatero.\n";
        }
        return "";
    }
    
    private static String TrianguloIsoseles(int l1, int l2, int l3)
    {
        if ( (l1 == l2 && l1 != l3) ||
             (l1 == l3 && l2 != l3) ||
             (l2 == l3 && l1 != l3) )
        {
            return "Isoseles.\n";
        }
        return "";
    }
        
    private static String TrianguloEscaleno(int l1, int l2, int l3)
    {
        if (l1 != l2 && l2 != l3 && l3 != l1)
        {
            return "Escaleno.\n";
        }
        return "";
    }
}
