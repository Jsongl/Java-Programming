/*  Clase para el mantenimiento de Cuidadores.
    Caracteristicas:
        

    *Proyecto de programacion I - Tercer cuatrimestre 2015
    Estudiante: JangSong Leung
*/

package Mantenimientos;

import Entidades.Cuidador;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class MantenimientoCuidador 
{
    
    ArrayList<Cuidador> ListaCuidadores;
    Cuidador TemporalCuidador; 
    File archivo = new File (".//Datos//cuidadores.txt");
    int HistoricoCodigo = 0;
    
    public MantenimientoCuidador() 
    {
            ListaCuidadores = new ArrayList<Cuidador> ();
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
              TemporalCuidador = new Cuidador ();

              //Primer campo ID.     
              TemporalCuidador.setCodigo(Integer.parseInt(linea.trim()));

              //Movimiento a proxima linea en archivo para carga dde Duracion.
              linea = buferlector.readLine ();
              TemporalCuidador.setNombre(linea.trim());
              
              //Movimiento a proxima linea en archivo para carga del Longitud de recorrido.
              linea = buferlector.readLine ();
              TemporalCuidador.setDireccion(linea.trim());
              
              //Movimiento a proxima linea en archivo para carga de maximo de visitantes.
              linea = buferlector.readLine ();
              TemporalCuidador.setTelefono(linea.trim());
              
              //Movimiento a proxima linea en archivo para carga de numero de especies.
              linea = buferlector.readLine ();
              TemporalCuidador.setFechaIngreso(linea.trim());

              //Movimiento a proxima linea en archivo para carga de especies.
              linea = buferlector.readLine ();
              
              String [] Especies = linea.split(",");
              ArrayList<Integer> TemporalEspecies = new ArrayList<> ();
              
              for (String Especie:Especies)
              {
                  TemporalEspecies.add(Integer.parseInt(Especie));
              }
              
              TemporalCuidador.setEspeciesId(TemporalEspecies);
              
              //Agregado del temporal al arreglo final.
              ListaCuidadores.add(TemporalCuidador);
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
          for (Cuidador TemporalCuidador:ListaCuidadores)
          {
            escritor.write(TemporalCuidador.ConcatenarString());
          }
          escritor.close();
        }
        catch(Exception e)
        {
            System.out.println("Error al escribir"); 
        }
    }
    
    public void AgregarCuidador (Cuidador CuidadorTemporal)
    {
        //Construccion del registro a agregar y agregado
        CuidadorTemporal.setCodigo(HistoricoCodigo);
        ListaCuidadores.add(CuidadorTemporal);
        
        HistoricoCodigo++;
        EscribirArchivo();
    }
    
    public void RemoverCuidador (int codigo)
    {
        int posicionborrar = 0;
        
        for (Cuidador temporal:ListaCuidadores)
        {
            if (temporal.getCodigo() == codigo) 
            {
                posicionborrar = ListaCuidadores.indexOf(temporal);
                break;
            }
        }
        
        ListaCuidadores.remove(posicionborrar);
        EscribirArchivo();
    }
    
    public void ModificarCuidador (Cuidador CuidadorTemporal)
    {
        int posicionmodificar = 0;
        
        for (Cuidador temporal:ListaCuidadores)
        {
            if (temporal.getCodigo() == CuidadorTemporal.getCodigo()) 
            {
                posicionmodificar = ListaCuidadores.indexOf(temporal);
                break;
            }
        }
        
        
        ListaCuidadores.set(posicionmodificar
                , CuidadorTemporal);
        
        EscribirArchivo();
    }
    
    public ArrayList<Cuidador> ListadoCuidador ()
    {
        return ListaCuidadores;
    }
    
    /*Busqueda de Cuidadores, la busqueda se realiza por
    codigo*/
    public Cuidador BusquedaCuidador (int codigo)
    {
        for (Cuidador temporal:ListaCuidadores)
            {
                if (temporal.getCodigo() == codigo)
                {
                    return(temporal);
                }
            } 
        return(null);
    }
    
    public Cuidador BusquedaCuidadorIndice (int indice)
    {
        return(ListaCuidadores.get(indice));
    }
    
}
