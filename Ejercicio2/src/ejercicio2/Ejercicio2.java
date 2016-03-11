/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Programación
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lado1, lado2, lado3;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print ("Digite la medida del lado 1: ");
        lado1 = teclado.nextInt();
        
        System.out.print ("Digite la medida del lado 2: ");
        lado2 = teclado.nextInt();
        
        System.out.print ("Digite la medida del lado 3: ");
        lado3 = teclado.nextInt();
        
        if (lado1 == lado2)
        {
            if (lado2 == lado3)
                System.out.println ("El triangulo es equilatero (3 lados iguales).");
            else
                System.out.println ("El triangulo es isosceles (2 lados iguales).");
        }
        else if (lado1 == lado3)
        {
            System.out.println ("El triangulo es isosceles (2 lados iguales).");
        }
        else if (lado2 == lado3)
        {
            System.out.println ("El triangulo es isosceles (2 lados iguales).");
        }
        else
        {
            System.out.println ("El triangulo es escaleno (ningun lado igual).");
        }
    }
    
}
