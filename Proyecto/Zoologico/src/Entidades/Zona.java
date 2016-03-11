/*  Clase para las zonas.
    Caracteristicas:
        Codigo: Integer.
        Nombre: String.
        Extension: Integer.

    *Proyecto de programacion I - Tercer cuatrimestre 2015
    Estudiante: JangSong Leung
*/

package Entidades;

public class Zona extends Principal 
{
    
    private String nombre;
    private int extension;

    public Zona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }
    
    @Override
    public String ConcatenarString ()
    {
        String concatenacion = "";
        
        concatenacion = "\n" + String.valueOf(Codigo) + "\n" + nombre
                + "\n" + String.valueOf(extension);
        
        return concatenacion;
    }   
    
}
