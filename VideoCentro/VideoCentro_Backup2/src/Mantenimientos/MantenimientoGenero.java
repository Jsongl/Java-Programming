
package Mantenimientos;

import Entidades.Genero;
import java.util.ArrayList;


public class MantenimientoGenero 
{

    private ArrayList<Genero> ListaGenero;
    
    public MantenimientoGenero()
    {
        ListaGenero = new ArrayList <Genero>();
    }
    
    public void AddElemento(Genero parametro)
    {
        ListaGenero.add(parametro);
    }
    
    public Boolean RemoveElemento (Genero parametro)
    {
        if (ListaGenero.contains(parametro))
        {
            int index = ListaGenero.indexOf(parametro);
            ListaGenero.remove(index);
            return true;
        }
        else
            return false;                    
    }
    
    public Boolean ModificarElemento (Genero parametro)
    {
        if (ListaGenero.contains(parametro))
        {
            int index = ListaGenero.indexOf(parametro);
            ListaGenero.set(index, parametro);
            return true;
        }
        else
            return false;      
    }
    
    public ArrayList<Genero> ListadoGenero()
    {
        return ListaGenero;        
    }    
}
