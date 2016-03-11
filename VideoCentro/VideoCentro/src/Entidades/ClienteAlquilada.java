
package Entidades;


public class ClienteAlquilada 
{

    int CodigoCliente;
    int CodigoAlquilada;

    public ClienteAlquilada(int CodigoCliente, int CodigoAlquilada) {
        this.CodigoCliente = CodigoCliente;
        this.CodigoAlquilada = CodigoAlquilada;
    }

    
    
    public int getCodigoCliente() {
        return CodigoCliente;
    }

    public void setCodigoCliente(int CodigoCliente) {
        this.CodigoCliente = CodigoCliente;
    }

    public int getCodigoAlquilada() {
        return CodigoAlquilada;
    }

    public void setCodigoAlquilada(int CodigoAlquilada) {
        this.CodigoAlquilada = CodigoAlquilada;
    }
    
    
    
}
