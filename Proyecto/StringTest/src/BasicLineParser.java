import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leungure
 */
public class BasicLineParser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Clases> personas = new ArrayList<Clases> ();
        Clases persona;
                
        String lineacodigo = "01,01,01,01,01,01";
        String[] lineacodigoparseo = lineacodigo.split(",");
        int incrementadorcodigo = 0;
        
        String lineanombres = "Paco,Hugo,Luis,Pepe,Pablo";
        String[] lineanombresparseo = lineanombres.split(",");
        
        
        for (String nombre: lineanombresparseo)
        {
            persona = new Clases ();
            persona.setNombre(nombre);
            for (String lineaparseada : lineacodigoparseo)
            {
                persona.setCodigos((Integer.valueOf(lineaparseada) + incrementadorcodigo++));
            }
            personas.add(persona);
        }
        
            
        for (Clases personaimprimir: personas)
        {
            System.out.printf("Los codigos para %s:", personaimprimir.getNombre());
            for (int codigo:personaimprimir.getCodigos())
            {
                System.out.printf (" %d", codigo);
            }
            System.out.printf(".\n");
        }
                
    }
    
}
