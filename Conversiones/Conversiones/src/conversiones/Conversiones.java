/*
 * *********Proyecto 1************
 * Programación Básica: Lunes Tarde
 * Profesor: Carlos Valle
 * Estudiante: JangSong Leung Ureña
 */

package conversiones;

import java.util.Scanner;

public class Conversiones {

    public static void main(String[] args) {
        int decimal, menu;
        Scanner teclado = new Scanner (System.in);
        
        /*
         *Lectura del valor decimal y validacion.
        */
        do {
        System.out.print ("Digite el numero decimal mayor o igual a cero para a convertir: ");
        decimal = teclado.nextInt();
            if (decimal < 0) {
                System.out.println ("El valor es menor a cero, trate de nuevo.");
            }
        } while (decimal < 0);
    
        /*
         *Impresion y lectura del menu de opciones
         *se valida que sea una opcion valida, y  se reintenta
        */
        System.out.println ();
        System.out.println ("******************");
        System.out.println ("* 1. Binario     *");
        System.out.println ("* 2. Hexadecimal *");
        System.out.println ("* 3. Octal       *");
        System.out.println ("* 4. Salir       *");
        System.out.println ("******************");
        System.out.println ();
        
        do { 
            System.out.print ("Digite la opcion al cual desea convertir: ");
            menu = teclado.nextInt();
            
            if (menu >= 1 && menu <= 3) {
                convertir (decimal, menu);
            } else if (menu == 4) {
                System.out.println ();
                System.out.println ("Muchas Gracias");
                System.exit (0);
            }
            else {
                System.out.println ("La opcion no es valida");
            }
       
        } while (menu < 1 || menu > 3);

        System.exit (0);
    }
    
    /*Procedimiento de conversion*/ 
    public static void convertir (int decimal, int menu) {
        String [] vector1 = new String [256];
        String [] vector2 = new String [256];
        int total = decimal, residuo, base = 0, contador=0, contador2=0;
        String sis_numerico = "";
        
        /*
         *Selecion de la base por medio del input del menu
        */
        switch (menu) {
            case 1: 
                base = 2; sis_numerico = "binario"; break;
            case 2: 
                base = 16; sis_numerico = "hexadecimal"; break;
            case 3: 
                base = 8; sis_numerico = "octal"; break;
        }
     
        /*
         *Conversion por medio de la division
         *del valor decimal entre la base
         *Tambien se intercambia los valores del 10-15
         *por su equivalente de letra en caso de conversion
         *Hexadecimal
        */
        while (total > 0) {
            residuo = total % base;
            
            if (base == 16 && residuo >= 10) {
                switch (residuo) {
                    case 10: vector1[contador] = "A"; break;
                    case 11: vector1[contador] = "B"; break;
                    case 12: vector1[contador] = "C"; break;
                    case 13: vector1[contador] = "D"; break;
                    case 14: vector1[contador] = "E"; break;
                    case 15: vector1[contador] = "F"; break;
                }
            }
            else {
                vector1[contador] = String.valueOf (residuo);
            }
            
            total = total / base;
            
            if (total > 0) {
            contador = contador + 1;
            }
        }   
   
        /*
         *Intercambio de valores del primer vector al
         *al segundo vector en order inverso
        */
        for (int y=contador; y >= 0; y--) {
            vector2[contador2] = vector1[y];
            contador2 = contador2 + 1;
        }

        /*
         *Presentacion de la informacion 
         *a pantalla desde el segundo vector
        */
        System.out.println ();   
        System.out.println ("******************************************************");
        System.out.println ("El valor decimal fue: " + decimal);
        System.out.print ("Su valor equivalente en " +sis_numerico+ " es: ");      
        for (int y=0; y <= contador; y++) {
            System.out.print (vector2[y]);
        }
        
        /*Mensaje de despedida*/
        System.out.println ();   
        System.out.println ("******************************************************");  
        System.out.println ();  
        System.out.println ("Muchas Gracias");
    }
    
}