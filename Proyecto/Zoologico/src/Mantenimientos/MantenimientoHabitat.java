/*  Clase para el mantenimiento de Habitas.
    Caracteristicas:
        

    *Proyecto de programacion I - Tercer cuatrimestre 2015
    Estudiante: JangSong Leung
*/

package Mantenimientos;

import Entidades.Habitat;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class MantenimientoHabitat 
{
    
    ArrayList<Habitat> ListaHabitats;
    Habitat TemporalHabitat; 
    File archivo = new File (".//Datos//habitats.txt");
    int HistoricoCodigo = 0;
    
    public MantenimientoHabitat() 
    {
            ListaHabitats = new ArrayList<Habitat> ();
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
              TemporalHabitat = new Habitat ();

              //Primer campo ID.     
              TemporalHabitat.setCodigo(Integer.parseInt(linea.trim()));

              //Movimiento a proxima linea en archivo para carga del nombre.
              linea = buferlector.readLine ();
              TemporalHabitat.setNombre(linea.trim());

              //Agregado del temporal al arreglo final.
              ListaHabitats.add(TemporalHabitat);
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
          for (Habitat TemporalHabitat:ListaHabitats)
          {
            escritor.write(TemporalHabitat.ConcatenarString());
          }
          escritor.close();
        }
        catch(Exception e)
        {
            System.out.println("Error al escribir"); 
        }
    }
    
    public void AgregarHabitat (Habitat HabitatTemporal)
    {
        //Construccion del registro a agregar y agregado
        HabitatTemporal.setCodigo(HistoricoCodigo);
        ListaHabitats.add(HabitatTemporal);
        
        HistoricoCodigo++;
        EscribirArchivo();
    }
    
    public void RemoverHabitat (int codigo)
    {
        int posicionborrar = 0;
        
        for (Habitat temporal:ListaHabitats)
        {
            if (temporal.getCodigo() == codigo) 
            {
                posicionborrar = ListaHabitats.indexOf(temporal);
                break;
            }
        }
        
        ListaHabitats.remove(posicionborrar);
        EscribirArchivo();
    }
    
    public void ModificarHabitat (Habitat HabitatTemporal)
    {
        int posicionmodificar = 0;
        
        for (Habitat temporal:ListaHabitats)
        {
            if (temporal.getCodigo() == HabitatTemporal.getCodigo()) 
            {
                posicionmodificar = ListaHabitats.indexOf(temporal);
                break;
            }
        }
        
        
        ListaHabitats.set(posicionmodificar
                , HabitatTemporal);
        
        EscribirArchivo();
    }
    
    public ArrayList<Habitat> ListadoHabitat ()
    {
        return ListaHabitats;
    }
    
    /*Busqueda de Habitats, la busqueda se realiza dependiendo del valor
    de la variable opcion. Posibles valores:
    1= Buscar por codigo
    2= Buscar por nombre*/
    public Habitat BusquedaHabitat (int opcion, int codigo, String nombre)
    {
        for (Habitat temporal:ListaHabitats)
            {
                if ((opcion == 1 && temporal.getCodigo() == codigo) ||
                        (opcion == 2 && temporal.getNombre().equals(nombre)))
                {
                    return(temporal);
                }
            } 
        return(null);
    }
    
    public Habitat BusquedaHabitatIndice (int indice)
    {
        return(ListaHabitats.get(indice));
    }
    
    public String obtenerHabitatNombre (int HabitatId)
    {
        for (Habitat temporal:ListaHabitats)
            {
                if (temporal.getCodigo() == HabitatId)
                    return temporal.getNombre();
            } 
        return null;
    }
    
    public int obtenerHabitatID (String Nombre)
    {
        for (Habitat temporal:ListaHabitats)
            {
                if (temporal.getNombre().equals(Nombre))
                    return temporal.getCodigo();
            } 
        return 0;
    }
    
}
