/*  Clase para el mantenimiento de Guias.
    Caracteristicas:
        

    *Proyecto de programacion I - Tercer cuatrimestre 2015
    Estudiante: JangSong Leung
*/

package Mantenimientos;

import Entidades.Guia;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class MantenimientoGuia 
{
    
    ArrayList<Guia> ListaGuias;
    Guia TemporalGuia; 
    File archivo = new File (".//Datos//guias.txt");
    int HistoricoCodigo = 0;
    
    public MantenimientoGuia() 
    {
            ListaGuias = new ArrayList<Guia> ();
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
              TemporalGuia = new Guia ();

              //Primer campo ID.     
              TemporalGuia.setCodigo(Integer.parseInt(linea.trim()));

              //Movimiento a proxima linea en archivo para carga dde Duracion.
              linea = buferlector.readLine ();
              TemporalGuia.setNombre(linea.trim());
              
              //Movimiento a proxima linea en archivo para carga del Longitud de recorrido.
              linea = buferlector.readLine ();
              TemporalGuia.setDireccion(linea.trim());
              
              //Movimiento a proxima linea en archivo para carga de maximo de visitantes.
              linea = buferlector.readLine ();
              TemporalGuia.setTelefono(linea.trim());
              
              //Movimiento a proxima linea en archivo para carga de numero de especies.
              linea = buferlector.readLine ();
              TemporalGuia.setFechaIngreso(linea.trim());

              //Movimiento a proxima linea en archivo para carga de intinerarios.
              linea = buferlector.readLine ();
              
              String [] Intinerarios = linea.split(",");
              ArrayList<Integer> TemporalIntinerarios = new ArrayList<> ();
              
              for (String Intinerario:Intinerarios)
              {
                  TemporalIntinerarios.add(Integer.parseInt(Intinerario));
              }
              
              TemporalGuia.setIntinerariosId(TemporalIntinerarios);
              
              //Agregado del temporal al arreglo final.
              ListaGuias.add(TemporalGuia);
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
          for (Guia TemporalGuia:ListaGuias)
          {
            escritor.write(TemporalGuia.ConcatenarString());
          }
          escritor.close();
        }
        catch(Exception e)
        {
            System.out.println("Error al escribir"); 
        }
    }
    
    public void AgregarGuia (Guia GuiaTemporal)
    {
        //Construccion del registro a agregar y agregado
        GuiaTemporal.setCodigo(HistoricoCodigo);
        ListaGuias.add(GuiaTemporal);
        
        HistoricoCodigo++;
        EscribirArchivo();
    }
    
    public void RemoverGuia (int codigo)
    {
        int posicionborrar = 0;
        
        for (Guia temporal:ListaGuias)
        {
            if (temporal.getCodigo() == codigo) 
            {
                posicionborrar = ListaGuias.indexOf(temporal);
                break;
            }
        }
        
        ListaGuias.remove(posicionborrar);
        EscribirArchivo();
    }
    
    public void ModificarGuia (Guia GuiaTemporal)
    {
        int posicionmodificar = 0;
        
        for (Guia temporal:ListaGuias)
        {
            if (temporal.getCodigo() == GuiaTemporal.getCodigo()) 
            {
                posicionmodificar = ListaGuias.indexOf(temporal);
                break;
            }
        }
        
        
        ListaGuias.set(posicionmodificar
                , GuiaTemporal);
        
        EscribirArchivo();
    }
    
    public ArrayList<Guia> ListadoGuia ()
    {
        return ListaGuias;
    }
    
    /*Busqueda de Guias, la busqueda se realiza por
    codigo*/
    public Guia BusquedaGuia (int codigo)
    {
        for (Guia temporal:ListaGuias)
            {
                if (temporal.getCodigo() == codigo)
                {
                    return(temporal);
                }
            } 
        return(null);
    }
    
    public Guia BusquedaGuiaIndice (int indice)
    {
        return(ListaGuias.get(indice));
    }
    
}
