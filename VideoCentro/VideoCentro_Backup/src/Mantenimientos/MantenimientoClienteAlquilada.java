
package Mantenimientos;

import Entidades.ClienteAlquilada;
import java.util.ArrayList;


public class MantenimientoClienteAlquilada 
{

    private ArrayList<ClienteAlquilada> ListaClienteAlquilada;
    
    public MantenimientoClienteAlquilada()
    {
        ListaClienteAlquilada = new ArrayList <ClienteAlquilada>();
    }
    
    public void AddElemento(ClienteAlquilada parametro)
    {
        ListaClienteAlquilada.add(parametro);
    }
    
    public Boolean RemoveElemento (ClienteAlquilada parametro)
    {
        if (ListaClienteAlquilada.contains(parametro))
        {
            int index = ListaClienteAlquilada.indexOf(parametro);
            ListaClienteAlquilada.remove(index);
            return true;
        }
        else
            return false;                    
    }
    
    public Boolean ModificarElemento (ClienteAlquilada parametro)
    {
        if (ListaClienteAlquilada.contains(parametro))
        {
            int index = ListaClienteAlquilada.indexOf(parametro);
            ListaClienteAlquilada.set(index, parametro);
            return true;
        }
        else
            return false;      
    }
    
    public ArrayList<ClienteAlquilada> ListadoClienteAlquilada()
    {
        return ListaClienteAlquilada;        
    }    
}
