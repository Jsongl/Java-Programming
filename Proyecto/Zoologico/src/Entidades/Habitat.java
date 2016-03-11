/*  Clase para los habitads.
    Caracteristicas:
        Codigo: Integer.
        Nombre: String.

    *Proyecto de programacion I - Tercer cuatrimestre 2015
    Estudiante: JangSong Leung
*/

package Entidades;

public class Habitat extends Principal 
{
    
    private String nombre;

    public Habitat() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String ConcatenarString ()
    {
        String concatenacion = "";
        
        concatenacion = "\n" + String.valueOf(Codigo) + "\n" + nombre;
        
        return concatenacion;
    }        
    
}
