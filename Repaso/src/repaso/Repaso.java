/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.util.Scanner;

/**
 *
 * @author Programación
 */
public class Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vari1, vari2;
        Scanner teclado = new Scanner(System.in);
               
        System.out.print("Digite Numero 1: ");
        vari1 = teclado.nextInt();
        
        System.out.print("Digite Numero 2: ");
        vari2 = teclado.nextInt();
        
        if (vari1 > vari2) 
                System.out.println ("Variable 1 es mayor");
                else if (vari1 != vari2)
                    System.out.println ("Variable 2 es mayor");
                else
                    System.out.println("Las variables son iguales");
    
    }
    
}
