/*  Clase para el mantenimiento de Zona.
    Caracteristicas:
        

    *Proyecto de programacion I - Tercer cuatrimestre 2015
    Estudiante: JangSong Leung
*/

package Mantenimientos;

import Entidades.Zona;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class MantenimientoZona 
{
    
    ArrayList<Zona> ListaZonas;
    Zona TemporalZona; 
    File archivo = new File (".//Datos//zonas.txt");
    int HistoricoCodigo = 0;
    
    public MantenimientoZona() 
    {
            ListaZonas = new ArrayList<Zona> ();
    }
    
    public void CargarDeArchivo ()
    {
        String linea = "";
        FileReader lector = null;

        try {
          lector = new FileReader(archivo);
          BufferedReader buferlector = new BufferedReader(lector);

          //Recuperardor de historico incremental del codigo.
          HistoricoCodigo = Integer.parseInt(buferlector.readLine ());
          
          //Ciclo while for elemento del array.
          while ((linea = buferlector.readLine()) != null) {

              //Inicializacion del registro temporal.
              TemporalZona = new Zona ();

              //Primer campo ID.     
              TemporalZona.setCodigo(Integer.parseInt(linea.trim()));

              //Movimiento a proxima linea en archivo para carga del nombre.
              linea = buferlector.readLine ();
              TemporalZona.setNombre(linea.trim());
              
              //Movimiento a proxima linea en archivo para carga del nombre.
              linea = buferlector.readLine ();
              TemporalZona.setExtension(Integer.parseInt(linea.trim()));

              //Agregado del temporal al arreglo final.
              ListaZonas.add(TemporalZona);
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
    
    public void EscribirArchivo () 
    {
        try {
          //salida al File (Archivo);
          FileWriter escritor = new FileWriter(archivo);

          escritor.write(String.valueOf(HistoricoCodigo));
          for (Zona TemporalZona:ListaZonas)
          {
            escritor.write(TemporalZona.ConcatenarString());
          }
          escritor.close();
        }
        catch(Exception e)
        {
            System.out.println("Error al escribir"); 
        }
    }
    
    public void AgregarZona (Zona ZonaTemporal)
    {
        //Construccion del registro a agregar y agregado
        ZonaTemporal.setCodigo(HistoricoCodigo);
        ListaZonas.add(ZonaTemporal);
        
        HistoricoCodigo++;
        EscribirArchivo();
    }
    
    public void RemoverZona (int codigo)
    {
        int posicionborrar = 0;
        
        for (Zona temporal:ListaZonas)
        {
            if (temporal.getCodigo() == codigo) 
            {
                posicionborrar = ListaZonas.indexOf(temporal);
                break;
            }
        }
        
        ListaZonas.remove(posicionborrar);
        EscribirArchivo();
    }
    
    public void ModificarZona (Zona ZonaTemporal)
    {
        int posicionmodificar = 0;
        
        for (Zona temporal:ListaZonas)
        {
            if (temporal.getCodigo() == ZonaTemporal.getCodigo()) 
            {
                posicionmodificar = ListaZonas.indexOf(temporal);
                break;
            }
        }
        
        
        ListaZonas.set(posicionmodificar
                , ZonaTemporal);
        
        EscribirArchivo();
    }
    
    public ArrayList<Zona> ListadoZona ()
    {
        return ListaZonas;
    }
    
    /*Busqueda de Zonas, la busqueda se realiza dependiendo del valor
    de la variable opcion. Posibles valores:
    1= Buscar por codigo
    2= Buscar por nombre*/
    public Zona BusquedaZona (int opcion, int codigo, String nombre)
    {
        for (Zona temporal:ListaZonas)
            {
                if ((opcion == 1 && temporal.getCodigo() == codigo) ||
                        (opcion == 2 && temporal.getNombre().equals(nombre)))
                {
                    return(temporal);
                }
            } 
        return(null);
    }
    
    public Zona BusquedaZonaIndice (int indice)
    {
        return(ListaZonas.get(indice));
    }
    
    public String obtenerZonaNombre (int ZonaId)
    {
        for (Zona temporal:ListaZonas)
            {
                if (temporal.getCodigo() == ZonaId)
                    return temporal.getNombre();
            } 
        return null;
    }
    
    public int obtenerZonaID (String Nombre)
    {
        for (Zona temporal:ListaZonas)
            {
                if (temporal.getNombre().equals(Nombre))
                    return temporal.getCodigo();
            } 
        return 0;
    }
    
    
}
