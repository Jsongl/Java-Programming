
package Mantenimientos;

import Entidades.Parametros;
import java.util.ArrayList;


public class MantenimientoParametros 
{

    private ArrayList<Parametros> ListaParametros;
    
    public MantenimientoParametros()
    {
        ListaParametros = new ArrayList <Parametros>();
    }
    
    public void AddElemento(Parametros parametro)
    {
        ListaParametros.add(parametro);
    }
    
    public Boolean RemoveElemento (Parametros parametro)
    {
        if (ListaParametros.contains(parametro))
        {
            int index = ListaParametros.indexOf(parametro);
            ListaParametros.remove(index);
            return true;
        }
        else
            return false;                    
    }
    
    public Boolean ModificarElemento (Parametros parametro)
    {
        if (ListaParametros.contains(parametro))
        {
            int index = ListaParametros.indexOf(parametro);
            ListaParametros.set(index, parametro);
            return true;
        }
        else
            return false;      
    }
    
    public ArrayList<Parametros> ListadoParametros()
    {
        return ListaParametros;        
    }
}
