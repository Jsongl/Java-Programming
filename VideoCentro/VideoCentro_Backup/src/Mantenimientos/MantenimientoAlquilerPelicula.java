
package Mantenimientos;

import Entidades.AlquilerPelicula;
import java.util.ArrayList;


public class MantenimientoAlquilerPelicula 
{

    private ArrayList<AlquilerPelicula> ListaAlquilerPelicula;
    
    public MantenimientoAlquilerPelicula()
    {
        ListaAlquilerPelicula = new ArrayList <AlquilerPelicula>();
    }
    
    public void AddElemento(AlquilerPelicula parametro)
    {
        ListaAlquilerPelicula.add(parametro);
    }
    
    public Boolean RemoveElemento (AlquilerPelicula parametro)
    {
        if (ListaAlquilerPelicula.contains(parametro))
        {
            int index = ListaAlquilerPelicula.indexOf(parametro);
            ListaAlquilerPelicula.remove(index);
            return true;
        }
        else
            return false;                    
    }
    
    public Boolean ModificarElemento (AlquilerPelicula parametro)
    {
        if (ListaAlquilerPelicula.contains(parametro))
        {
            int index = ListaAlquilerPelicula.indexOf(parametro);
            ListaAlquilerPelicula.set(index, parametro);
            return true;
        }
        else
            return false;      
    }
    
    public ArrayList<AlquilerPelicula> ListadoAlquilerPelicula()
    {
        return ListaAlquilerPelicula;        
    }    
}
