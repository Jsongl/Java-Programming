/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Programación
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int limite, contador, totalpar = 0, totalimpar = 0;
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Digite el numero limite: ");
        limite = teclado.nextInt();
        
        for(contador = 1; contador <= limite; contador++)
        {
            if ((contador % 2) == 0)
                totalpar = totalpar + contador;
            else
                totalimpar = totalimpar + contador;
        }
        
        System.out.println("Total de numeros pares: "+ totalpar);
        System.out.println("Total de numeros impares: "+ totalimpar);
    }
    
}
