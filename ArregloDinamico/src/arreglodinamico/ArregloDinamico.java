/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglodinamico;

import java.util.ArrayList;



public class ArregloDinamico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nombres;
        
        nombres = new ArrayList<>();
        
        nombres.add ("Ana");
        nombres.add ("Luisa");
        nombres.add ("Felipe");        
        System.out.println (nombres); //[Ana, Luisa, Felipe]
        
        nombres.add (1,"Pablo");        
        System.out.println (nombres); //[Ana, pablo, Luisa, Felipe]
        
        String remover = nombres.remove (0);        
        System.out.println (nombres); //[pablo, Luisa, Felipe]
        
        nombres.set (0,"Alfonso");        
        System.out.println (nombres); //[Alfonso, Luisa, Felipe]
        
        String s = nombres.get(1);
        String ultimo = nombres.get (nombres.size() - 1);        
        System.out.println (s + " " + ultimo); //LuisaFelipe
        
        for (String campo : nombres)
        {
            System.out.printf 
                ("Campo numero: %d - Valor del campo: %s \n", 
                nombres.indexOf(campo), campo);
        }
    }
    
}
