/*  Clase para los habitads.
    Caracteristicas:
        Codigo: Integer.
        Nombre: String.

    *Proyecto de programacion I - Tercer cuatrimestre 2015
    Estudiante: JangSong Leung
*/

package Entidades;

public class Habitat 
{
    
    private int codigo;
    private String nombre;

    public Habitat() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String ConcatenarString ()
    {
        String concatenacion = "";
        
        concatenacion = "\n" + String.valueOf(codigo) + "\n" + nombre;
        
        return concatenacion;
    }        
    
}
