
package Entidades;


public class Parametros 
{

    int Codigo;
    String Nombre;
    String Valor;
    Boolean Estado;

    public Parametros(int Codigo, String Nombre, String Valor, Boolean Estado) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Valor = Valor;
        this.Estado = Estado;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getValor() {
        return Valor;
    }

    public void setValor(String Valor) {
        this.Valor = Valor;
    }

    public Boolean getEstado() {
        return Estado;
    }

    public void setEstado(Boolean Estado) {
        this.Estado = Estado;
    }
    
    
            
}
