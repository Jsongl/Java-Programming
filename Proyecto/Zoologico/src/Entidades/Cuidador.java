/*  Clase para los Guias.
    Caracteristicas:
        Numerico codigo;
        Numerico Nombre; 
        Numerico Direccion; 
        Numerico Telefono; 
        Numerico FechaIngreso; 
        Lista Itinerarios;

    *Proyecto de programacion I - Tercer cuatrimestre 2015
    Estudiante: JangSong Leung
*/

package Entidades;

import java.util.ArrayList;

public class Cuidador extends Principal 
{

    private String Nombre;
    private String Direccion;
    private String Telefono;
    private String FechaIngreso;
    private ArrayList<Integer> EspeciesId = new ArrayList<>();

    public Cuidador() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(String FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    public ArrayList<Integer> getEspeciesId() {
        return EspeciesId;
    }

    public void setEspeciesId(ArrayList<Integer> EspeciesId) {
        this.EspeciesId = EspeciesId;
    }
    
    @Override
    public String ConcatenarString ()
    {
        String concatenacion = "";
        String listaEspecies = "";
        
        for (int especie:EspeciesId)
        {
            listaEspecies = String.valueOf(especie) + "," + listaEspecies;
        }
        
        concatenacion = "\n" + String.valueOf(Codigo) 
                + "\n" + String.valueOf(Nombre)
                + "\n" + String.valueOf(Direccion)
                + "\n" + String.valueOf(Telefono)
                + "\n" + String.valueOf(FechaIngreso)
                + "\n" + listaEspecies;
        
        return concatenacion;
    }
}
