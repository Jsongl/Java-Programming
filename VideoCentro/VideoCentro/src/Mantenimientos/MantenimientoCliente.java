
package Mantenimientos;

import Entidades.Cliente;
import java.util.ArrayList;


public class MantenimientoCliente 
{

    private ArrayList<Cliente> ListaCliente;
    
    public MantenimientoCliente()
    {
        ListaCliente = new ArrayList <Cliente>();
    }
    
    public void AddElemento(Cliente parametro)
    {
        ListaCliente.add(parametro);
    }
    
    public Boolean RemoveElemento (Cliente parametro)
    {
        if (ListaCliente.contains(parametro))
        {
            int index = ListaCliente.indexOf(parametro);
            ListaCliente.remove(index);
            return true;
        }
        else
            return false;                    
    }
    
    public Boolean ModificarElemento (Cliente parametro)
    {
        if (ListaCliente.contains(parametro))
        {
            int index = ListaCliente.indexOf(parametro);
            ListaCliente.set(index, parametro);
            return true;
        }
        else
            return false;      
    }
    
    public ArrayList<Cliente> ListadoCliente()
    {
        return ListaCliente;        
    }    
}
