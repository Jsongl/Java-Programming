
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
public class NewMain {

    static File archivo = new File ("E://U//Programacion I//Proyecto//personas.txt");
    
    static ArrayList<Clases> personas = new ArrayList<Clases> ();
    static Clases persona;
                
       
    public static void main(String[] args) 
    {
   
        CargarArray();
        ImprimirArray();
    }
    
    public static void CargarArray ()
    {
    String linea = "";
    FileReader lector = null;
    
    try {
      lector = new FileReader(archivo);
      BufferedReader buferlector = new BufferedReader(lector);

      while ((linea = buferlector.readLine()) != null) {
          persona = new Clases ();
          persona.setNombre(linea.trim());
          linea = buferlector.readLine ();
          for (String lineaparseada : linea.split(","))
            {
                persona.setCodigos(Integer.valueOf(lineaparseada));
            }
          personas.add(persona);
      }
    } 
    catch (FileNotFoundException e) 
        {throw new RuntimeException("Archivo no encontrado");} 
    catch (IOException e) 
        {throw new RuntimeException("Ocurrio un error de entrada/salida");} 
    finally 
        {if (lector != null) 
            {try {lector.close();} 
                catch (IOException e) {e.printStackTrace();}
            }
        }
    }
    
    public static void ImprimirArray ()
    { 
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
