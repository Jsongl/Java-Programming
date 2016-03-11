/*  Clase para el mantenimiento de Intinerario.
    Caracteristicas:
        

    *Proyecto de programacion I - Tercer cuatrimestre 2015
    Estudiante: JangSong Leung
*/

package Mantenimientos;

import Entidades.Intinerario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class MantenimientoIntinerario 
{
    
    ArrayList<Intinerario> ListaIntinerarios;
    Intinerario TemporalIntinerario; 
    File archivo = new File (".//Datos//intinerarios.txt");
    int HistoricoCodigo = 0;
    
    public MantenimientoIntinerario() 
    {
            ListaIntinerarios = new ArrayList<Intinerario> ();
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
              TemporalIntinerario = new Intinerario ();

              //Primer campo ID.     
              TemporalIntinerario.setCodigo(Integer.parseInt(linea.trim()));

              //Movimiento a proxima linea en archivo para carga dde Duracion.
              linea = buferlector.readLine ();
              TemporalIntinerario.setDuracion(Integer.parseInt(linea.trim()));
              
              //Movimiento a proxima linea en archivo para carga del Longitud de recorrido.
              linea = buferlector.readLine ();
              TemporalIntinerario.setLongitud(Integer.parseInt(linea.trim()));
              
              //Movimiento a proxima linea en archivo para carga de maximo de visitantes.
              linea = buferlector.readLine ();
              TemporalIntinerario.setMaximoVisitantes(Integer.parseInt(linea.trim()));
              
              //Movimiento a proxima linea en archivo para carga de numero de especies.
              linea = buferlector.readLine ();
              TemporalIntinerario.setNumeroEspecies(Integer.parseInt(linea.trim()));

              //Movimiento a proxima linea en archivo para carga de zonas.
              linea = buferlector.readLine ();
              
              String [] Zonas = linea.split(",");
              ArrayList<Integer> TemporalZonas = new ArrayList<> ();
              
              for (String Zona:Zonas)
              {
                  TemporalZonas.add(Integer.parseInt(Zona));
                  
              }
              
              TemporalIntinerario.setZonasId(TemporalZonas);
              
              //Agregado del temporal al arreglo final.
              ListaIntinerarios.add(TemporalIntinerario);
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
          for (Intinerario TemporalIntinerario:ListaIntinerarios)
          {
            escritor.write(TemporalIntinerario.ConcatenarString());
          }
          escritor.close();
        }
        catch(Exception e)
        {
            System.out.println("Error al escribir"); 
        }
    }
    
    public void AgregarIntinerario (Intinerario IntinerarioTemporal)
    {
        //Construccion del registro a agregar y agregado
        IntinerarioTemporal.setCodigo(HistoricoCodigo);
        ListaIntinerarios.add(IntinerarioTemporal);
        
        HistoricoCodigo++;
        EscribirArchivo();
    }
    
    public void RemoverIntinerario (int codigo)
    {
        int posicionborrar = 0;
        
        for (Intinerario temporal:ListaIntinerarios)
        {
            if (temporal.getCodigo() == codigo) 
            {
                posicionborrar = ListaIntinerarios.indexOf(temporal);
                break;
            }
        }
        
        ListaIntinerarios.remove(posicionborrar);
        EscribirArchivo();
    }
    
    public void ModificarIntinerario (Intinerario IntinerarioTemporal)
    {
        int posicionmodificar = 0;
        
        for (Intinerario temporal:ListaIntinerarios)
        {
            if (temporal.getCodigo() == IntinerarioTemporal.getCodigo()) 
            {
                posicionmodificar = ListaIntinerarios.indexOf(temporal);
                break;
            }
        }
        
        
        ListaIntinerarios.set(posicionmodificar
                , IntinerarioTemporal);
        
        EscribirArchivo();
    }
    
    public ArrayList<Intinerario> ListadoIntinerario ()
    {
        return ListaIntinerarios;
    }
    
    /*Busqueda de Intinerarios, la busqueda se realiza por
    codigo*/
    public Intinerario BusquedaIntinerario (int codigo)
    {
        for (Intinerario temporal:ListaIntinerarios)
            {
                if (temporal.getCodigo() == codigo)
                {
                    return(temporal);
                }
            } 
        return(null);
    }
    
    public Intinerario BusquedaIntinerarioIndice (int indice)
    {
        return(ListaIntinerarios.get(indice));
    }
    
}
