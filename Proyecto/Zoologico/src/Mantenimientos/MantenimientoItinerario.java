/*  Clase para el mantenimiento de Itinerario.
    Caracteristicas:
        

    *Proyecto de programacion I - Tercer cuatrimestre 2015
    Estudiante: JangSong Leung
*/

package Mantenimientos;

import Entidades.Itinerario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class MantenimientoItinerario 
{
    
    ArrayList<Itinerario> ListaItinerarios;
    Itinerario TemporalItinerario; 
    File archivo = new File (".//Datos//Itinerarios.txt");
    int HistoricoCodigo = 0;
    
    public MantenimientoItinerario() 
    {
            ListaItinerarios = new ArrayList<Itinerario> ();
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
              TemporalItinerario = new Itinerario ();

              //Primer campo ID.     
              TemporalItinerario.setCodigo(Integer.parseInt(linea.trim()));

              //Movimiento a proxima linea en archivo para carga dde Duracion.
              linea = buferlector.readLine ();
              TemporalItinerario.setDuracion(Integer.parseInt(linea.trim()));
              
              //Movimiento a proxima linea en archivo para carga del Longitud de recorrido.
              linea = buferlector.readLine ();
              TemporalItinerario.setLongitud(Integer.parseInt(linea.trim()));
              
              //Movimiento a proxima linea en archivo para carga de maximo de visitantes.
              linea = buferlector.readLine ();
              TemporalItinerario.setMaximoVisitantes(Integer.parseInt(linea.trim()));
              
              //Movimiento a proxima linea en archivo para carga de numero de especies.
              linea = buferlector.readLine ();
              TemporalItinerario.setNumeroEspecies(Integer.parseInt(linea.trim()));

              //Movimiento a proxima linea en archivo para carga de zonas.
              linea = buferlector.readLine ();
              
              String [] Zonas = linea.split(",");
              ArrayList<Integer> TemporalZonas = new ArrayList<> ();
              
              for (String Zona:Zonas)
              {
                  TemporalZonas.add(Integer.parseInt(Zona));
                  
              }
              
              TemporalItinerario.setZonasId(TemporalZonas);
              
              //Agregado del temporal al arreglo final.
              ListaItinerarios.add(TemporalItinerario);
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
          for (Itinerario TemporalItinerario:ListaItinerarios)
          {
            escritor.write(TemporalItinerario.ConcatenarString());
          }
          escritor.close();
        }
        catch(Exception e)
        {
            System.out.println("Error al escribir"); 
        }
    }
    
    public void AgregarItinerario (Itinerario ItinerarioTemporal)
    {
        //Construccion del registro a agregar y agregado
        ItinerarioTemporal.setCodigo(HistoricoCodigo);
        ListaItinerarios.add(ItinerarioTemporal);
        
        HistoricoCodigo++;
        EscribirArchivo();
    }
    
    public void RemoverItinerario (int codigo)
    {
        int posicionborrar = 0;
        
        for (Itinerario temporal:ListaItinerarios)
        {
            if (temporal.getCodigo() == codigo) 
            {
                posicionborrar = ListaItinerarios.indexOf(temporal);
                break;
            }
        }
        
        ListaItinerarios.remove(posicionborrar);
        EscribirArchivo();
    }
    
    public void ModificarItinerario (Itinerario ItinerarioTemporal)
    {
        int posicionmodificar = 0;
        
        for (Itinerario temporal:ListaItinerarios)
        {
            if (temporal.getCodigo() == ItinerarioTemporal.getCodigo()) 
            {
                posicionmodificar = ListaItinerarios.indexOf(temporal);
                break;
            }
        }
        
        
        ListaItinerarios.set(posicionmodificar
                , ItinerarioTemporal);
        
        EscribirArchivo();
    }
    
    public ArrayList<Itinerario> ListadoItinerario ()
    {
        return ListaItinerarios;
    }
    
    /*Busqueda de Itinerarios, la busqueda se realiza por
    codigo*/
    public Itinerario BusquedaItinerario (int codigo)
    {
        for (Itinerario temporal:ListaItinerarios)
            {
                if (temporal.getCodigo() == codigo)
                {
                    return(temporal);
                }
            } 
        return(null);
    }
    
    public Itinerario BusquedaItinerarioIndice (int indice)
    {
        return(ListaItinerarios.get(indice));
    }
    
}
