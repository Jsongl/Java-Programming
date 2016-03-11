/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

import Clases.Matriz;
import java.util.Scanner;

/**
 *
 * @author leungure
 */
public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Matriz gato = new Matriz ();
        int x, y, numero;
        
        gato.printMat();
        
        System.out.printf("Digite fila: ");
        x = teclado.nextInt() - 1;
        
        System.out.printf("Digite columna: ");
        y = teclado.nextInt() - 1;
        
        System.out.printf("Digite valor nuevo: ");
        numero = teclado.nextInt();
        
        gato.SetMat(x, y, numero);
        
        
        gato.printMat();
    }
    
}
