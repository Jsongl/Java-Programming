/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileio_personal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class FileIO_Personal {
    
    
    static File archivo = new File (".//Datos//file4.txt");
    static File archivo2 = new File (".//Datos//file5.txt");
    static ArrayList<String> Listado = new ArrayList<>();

    public static void main(String[] args) {
    

        
        Scanner entrada = new Scanner (System.in);
        int contador = 0;
        int cantidadlineasinsertar = 0;
        int cantidadlineas = 0;
        
        System.out.printf ("Digite la cantidad de lineas a agregar: ");
        cantidadlineasinsertar = entrada.nextInt();
        
        cantidadlineas = contadordelineas(archivo) + 1;
        
        for (int i=1; i <= cantidadlineasinsertar; i++) 
        {
            escribirTextoArchivo(archivo, "Linea "+String.valueOf(cantidadlineas)+"\n");        
            cantidadlineas++;
        }
        
        
        ArchivoAestructura(archivo);
        escribirEstructuraArchivo(archivo2);
        //System.out.printf("TEST: \n%s", leerTextoArchivo(archivo));
        contador = 1;
        for (String temporal:Listado)
        {
            System.out.printf ("Contenido del record numero %d: %s\n",contador, temporal );
            contador++;
        }
        
    }
    
 
    public static int contadordelineas (File nombreArchivo)
    {
        FileReader lector = null;
        String lineabuffer;
        int numerolineas = 0;
        try
        {
            lector = new FileReader(nombreArchivo);
            BufferedReader buferlector = new BufferedReader(lector);
            while ((lineabuffer = buferlector.readLine()) != null)
            {
                numerolineas++;
            }
            lector.close();
            return numerolineas;
        } catch (FileNotFoundException e) {
          throw new RuntimeException("Archivo no encontrado");
        } catch (IOException e) {
          throw new RuntimeException("Ocurrio un error de entrada/salida");
        } finally {
          if (lector != null) {
            try {
              lector.close();
            } catch (IOException e) {
              e.printStackTrace();
            }
          }
        }
    }
    
  public static String leerTextoArchivo(File nombreArchivo) {
    String texto = "";
    String linea = "";
    FileReader lector = null;
    try {
      lector = new FileReader(nombreArchivo);
      BufferedReader buferlector = new BufferedReader(lector);
      while ((linea = buferlector.readLine()) != null) {
        texto += linea + "\n";
      }
    } catch (FileNotFoundException e) {
      throw new RuntimeException("Archivo no encontrado");
    } catch (IOException e) {
      throw new RuntimeException("Ocurrio un error de entrada/salida");
    } finally {
      if (lector != null) {
        try {
          lector.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
    return texto;
  }    
    
  public static void ArchivoAestructura(File nombreArchivo) {
    String linea = "";
    FileReader lector = null;
    try {
      lector = new FileReader(nombreArchivo);
      BufferedReader buferlector = new BufferedReader(lector);
      while ((linea = buferlector.readLine()) != null) {
          Listado.add (linea);
      }
    } catch (FileNotFoundException e) {
      throw new RuntimeException("Archivo no encontrado");
    } catch (IOException e) {
      throw new RuntimeException("Ocurrio un error de entrada/salida");
    } finally {
      if (lector != null) {
        try {
          lector.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }   
    
  public static void escribirTextoArchivo(File nombreArchivo, String texto) {

    try {
      //salida = new File (Archivo);
      FileWriter escritor = new FileWriter(nombreArchivo, true);
      escritor.write(texto);
      escritor.close();
    } 
    catch(Exception e)
    {
        System.out.println("Error al escribir"); 
    }

  }  
  
    public static void escribirEstructuraArchivo(File nombreArchivo) {

    try {
      //salida = new File (Archivo);
      FileWriter escritor = new FileWriter(nombreArchivo);
      
      
      
      for (String temp:Listado)
      {
          
        escritor.write(temp);
      }
      escritor.close();
    } 
    catch(Exception e)
    {
        System.out.println("Error al escribir"); 
    }

  }  
  
}
