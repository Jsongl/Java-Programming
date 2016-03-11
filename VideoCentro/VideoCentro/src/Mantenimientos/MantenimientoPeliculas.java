
package Mantenimientos;

import Entidades.Peliculas;
import java.util.ArrayList;


public class MantenimientoPeliculas 
{

    private ArrayList<Peliculas> ListaPeliculas;
    
    public MantenimientoPeliculas()
    {
        ListaPeliculas = new ArrayList <Peliculas>();
    }
    
    public void AddElemento(Peliculas parametro)
    {
        ListaPeliculas.add(parametro);
    }
    
    public Boolean RemoveElemento (Peliculas parametro)
    {
        if (ListaPeliculas.contains(parametro))
        {
            int index = ListaPeliculas.indexOf(parametro);
            ListaPeliculas.remove(index);
            return true;
        }
        else
            return false;                    
    }
    
    public Boolean ModificarElemento (Peliculas parametro)
    {
        if (ListaPeliculas.contains(parametro))
        {
            int index = ListaPeliculas.indexOf(parametro);
            ListaPeliculas.set(index, parametro);
            return true;
        }
        else
            return false;      
    }
    
    public ArrayList<Peliculas> ListadoPeliculas()
    {
        return ListaPeliculas;        
    }    
}
