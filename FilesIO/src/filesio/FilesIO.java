/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class FilesIO {

    public static void main(String[] args) {
    
        
        escribirTextoArchivo("C://Test//file4.txt", "Linea1\nLinea2\n");
        System.out.printf("TEST: \n%s", leerTextoArchivo("C:\\Test\\file2.txt"));
    }
    
    
    public static String leerTextoArchivo(String nombreArchivo) {
    String texto = "";
    FileReader archivo = null;
    String linea = "";
    try {
      archivo = new FileReader(nombreArchivo);
      BufferedReader lector = new BufferedReader(archivo);
      while ((linea = lector.readLine()) != null) {
        texto += linea + "\n";
      }
    } catch (FileNotFoundException e) {
      throw new RuntimeException("Archivo no encontrado");
    } catch (IOException e) {
      throw new RuntimeException("Ocurrio un error de entrada/salida");
    } finally {
      if (archivo != null) {
        try {
          archivo.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
    return texto;
  }    
    
    
  public static void escribirTextoArchivo(String nombreArchivo, String texto) {
    //FileWriter salida = null;
    File salida = null; 
    try {
      salida = new File (nombreArchivo);
      FileWriter escritor = new FileWriter(salida, true);
      escritor.write(texto);
      escritor.close();
    } 
    catch(Exception e)
    {
        System.out.println("Error al escribir"); 
    }

  }  
}
