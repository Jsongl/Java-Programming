/*  Clase para el mantenimiento de Especies.
    Caracteristicas:
        
 
    *Proyecto de programacion I - Tercer cuatrimestre 2015
    Estudiante: JangSong Leung
*/

package Entidades;

import java.util.ArrayList;

public class Especie extends Principal 
{
    
    private String Nombre;
    private String NombreCientifico;
    private String Descripcion;
    private ArrayList<Integer> habitatsId = new ArrayList<>();
    private ArrayList<Integer> zonasId = new ArrayList<>();

    public Especie() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombreCientifico() {
        return NombreCientifico;
    }

    public void setNombreCientifico(String NombreCientifico) {
        this.NombreCientifico = NombreCientifico;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public ArrayList<Integer> getHabitatsId() {
        return habitatsId;
    }

    public void setHabitatsId(ArrayList<Integer> habitatsId) {
        this.habitatsId = habitatsId;
    }

    public ArrayList<Integer> getZonasId() {
        return zonasId;
    }

    public void setZonasId(ArrayList<Integer> zonasId) {
        this.zonasId = zonasId;
    }
    
    @Override
    public String ConcatenarString ()
    {
        String concatenacion = "";
        String listaHabitats = "";
        String listaZonas = "";
        
        for (int habitat:habitatsId)
        {
            listaHabitats = String.valueOf(habitat) + "," + listaHabitats;
        }
        
        for (int zona:zonasId)
        {
            listaZonas = String.valueOf(zona) + "," + listaZonas;
        }
        
        concatenacion = "\n" + String.valueOf(Codigo) 
                + "\n" + Nombre
                + "\n" + NombreCientifico
                + "\n" + Descripcion
                + "\n" + listaHabitats
                + "\n" + listaZonas;
        
        return concatenacion;
    } 
    
}
