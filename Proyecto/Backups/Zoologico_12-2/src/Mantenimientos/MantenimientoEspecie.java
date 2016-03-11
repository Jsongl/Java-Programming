/*  Clase para el mantenimiento de Especie.
    Caracteristicas:
        

    *Proyecto de programacion I - Tercer cuatrimestre 2015
    Estudiante: JangSong Leung
*/

package Mantenimientos;

import Entidades.Especie;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class MantenimientoEspecie 
{
    
    ArrayList<Especie> ListaEspecies;
    Especie TemporalEspecie; 
    File archivo = new File (".//Datos//especies.txt");
    int HistoricoCodigo = 0;
    
    public MantenimientoEspecie() 
    {
            ListaEspecies = new ArrayList<Especie> ();
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
              TemporalEspecie = new Especie ();

              //Primer campo ID.     
              TemporalEspecie.setCodigo(Integer.parseInt(linea.trim()));

              //Movimiento a proxima linea en archivo para carga del nombre.
              linea = buferlector.readLine ();
              TemporalEspecie.setNombre(linea.trim());
              
              //Movimiento a proxima linea en archivo para carga del nombre cientifico.
              linea = buferlector.readLine ();
              TemporalEspecie.setNombreCientifico(linea.trim());
              
              //Movimiento a proxima linea en archivo para carga de maximo de la descripcion.
              linea = buferlector.readLine ();
              TemporalEspecie.setDescripcion(linea.trim());
              
              //Movimiento a proxima linea en archivo para carga de habitats.
              linea = buferlector.readLine ();
              
              String [] Habitats = linea.split(",");
              ArrayList<Integer> TemporalHabitats = new ArrayList<> ();
              
              //Movimiento a proxima linea en archivo para carga de zonas.
              linea = buferlector.readLine ();
              
              String [] Zonas = linea.split(",");
              ArrayList<Integer> TemporalZonas = new ArrayList<> ();
              
              for (String Habitat:Habitats)
              {
                  TemporalHabitats.add(Integer.parseInt(Habitat));
                  
              }
              
              for (String Zona:Zonas)
              {
                  TemporalZonas.add(Integer.parseInt(Zona));
                  
              }
              
              TemporalEspecie.setHabitatsId(TemporalHabitats);
              TemporalEspecie.setZonasId(TemporalZonas);
              
              //Agregado del temporal al arreglo final.
              ListaEspecies.add(TemporalEspecie);
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
          for (Especie TemporalEspecie:ListaEspecies)
          {
            escritor.write(TemporalEspecie.ConcatenarString());
          }
          escritor.close();
        }
        catch(Exception e)
        {
            System.out.println("Error al escribir"); 
        }
    }
    
    public void AgregarEspecie (Especie EspecieTemporal)
    {
        //Construccion del registro a agregar y agregado
        EspecieTemporal.setCodigo(HistoricoCodigo);
        ListaEspecies.add(EspecieTemporal);
        
        HistoricoCodigo++;
        EscribirArchivo();
    }
    
    public void RemoverEspecie (int codigo)
    {
        int posicionborrar = 0;
        
        for (Especie temporal:ListaEspecies)
        {
            if (temporal.getCodigo() == codigo) 
            {
                posicionborrar = ListaEspecies.indexOf(temporal);
                break;
            }
        }
        
        ListaEspecies.remove(posicionborrar);
        EscribirArchivo();
    }
    
    public void ModificarEspecie (Especie EspecieTemporal)
    {
        int posicionmodificar = 0;
        
        for (Especie temporal:ListaEspecies)
        {
            if (temporal.getCodigo() == EspecieTemporal.getCodigo()) 
            {
                posicionmodificar = ListaEspecies.indexOf(temporal);
                break;
            }
        }
        
        
        ListaEspecies.set(posicionmodificar
                , EspecieTemporal);
        
        EscribirArchivo();
    }
    
    public ArrayList<Especie> ListadoEspecie ()
    {
        return ListaEspecies;
    }
    
    /*Busqueda de Especies, la busqueda se realiza por
    codigo*/
    public Especie BusquedaEspecie (int codigo)
    {
        for (Especie temporal:ListaEspecies)
            {
                if (temporal.getCodigo() == codigo)
                {
                    return(temporal);
                }
            } 
        return(null);
    }
    
    public Especie BusquedaEspecieIndice (int indice)
    {
        return(ListaEspecies.get(indice));
    }
    
    public String obtenerEspecieNombre (int EspecieId)
    {
        for (Especie temporal:ListaEspecies)
            {
                if (temporal.getCodigo() == EspecieId)
                    return temporal.getNombre();
            } 
        return null;
    }
    
    public int obtenerEspecieID (String Nombre)
    {
        for (Especie temporal:ListaEspecies)
            {
                if (temporal.getNombre().equals(Nombre))
                    return temporal.getCodigo();
            } 
        return 0;
    }
    
}
