/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2;

import java.util.Scanner;

public class VectoresInten {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int valorNumerico = 0;
        String valorAlfanumerico = "";
        int[] vec;
        int tamañoVector = 0;
        int TotalSuma = 0;
        int TotalProducto = 1;
        int DigitoIzquierdo = 0;
        int DigitoDerecho = 0;
        int DigitoMayor = 0;
        int DigitoMenor = 10;
        String Inversion = "";
        
        System.out.printf ("Ingrese un valor numerico: ");
        valorNumerico = entrada.nextInt();
        
        valorAlfanumerico = String.valueOf(valorNumerico);
        
        tamañoVector = valorAlfanumerico.length();
        
        vec = new int[tamañoVector];
        
        for (int posicion = 0; posicion < tamañoVector; posicion++)
        {
            vec[posicion] = Integer.parseInt (String.valueOf(valorAlfanumerico.charAt(posicion)));
        }
        
        for (int posicion = 0; posicion < tamañoVector; posicion++)
        {
            TotalSuma += vec[posicion];
            TotalProducto *= vec[posicion];   
            
            if (DigitoMayor <= vec[posicion])
            {
                DigitoMayor = vec[posicion];
            }
            
            if (DigitoMenor >= vec[posicion])
            {
                DigitoMenor = vec[posicion];
            }
        }
        
        for (int posicion = tamañoVector - 1; posicion >= 0; posicion--)
        {
            Inversion += vec[posicion];
        }
        
        DigitoIzquierdo = vec[0];
        DigitoDerecho = vec[tamañoVector-1];
        
        System.out.printf("*\n*\n");
        System.out.printf("**************************************\n");
        System.out.printf("**   VECTOR DE EXPRESION NUMERICA   **\n");
        System.out.printf("**************************************\n");
        System.out.printf("* Expresion Numerica: %d \n", valorNumerico);
        System.out.printf("**************************************\n");
        System.out.printf("*\n");
        System.out.printf("* 1.- Cantidad de digitos %d \n",tamañoVector);
        System.out.printf("* 2.- Suma de digitos: %d \n", TotalSuma);
        System.out.printf("* 3.- Producto de digitos: %d \n", TotalProducto);
        System.out.printf("* 4.- Digito derecho: %d \n", DigitoDerecho);
        System.out.printf("* 5.- Digito Izquierdo: %d \n", DigitoIzquierdo);
        System.out.printf("* 6.- Digito Mayor: %d \n", DigitoMayor);
        System.out.printf("* 7.- Digito Menor: %d \n", DigitoMenor);
        System.out.printf("* 8.- Inversion: %s \n", Inversion);
        System.out.printf("* \n");
        System.out.printf("**************************************\n");
        System.out.printf("");
    }    
}
