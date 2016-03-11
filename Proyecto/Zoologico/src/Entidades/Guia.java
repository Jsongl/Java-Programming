/*  Clase para los Itinerarios.
    Caracteristicas:
        Numerico codigo;
        Numerico duracion; //Duracion en minutos
        Numerico longitud; //Longitud en metros
        Numerico maximoVisitantes; //Numero maximo de visitantes
        Numerico numeroEspecies; //Numero de especies que visita

    *Proyecto de programacion I - Tercer cuatrimestre 2015
    Estudiante: JangSong Leung
*/

package Entidades;

import java.util.ArrayList;

public class Guia extends Principal 
{
    
    private String Nombre;
    private String Direccion;
    private String Telefono;
    private String FechaIngreso;
    private ArrayList<Integer> ItinerariosId = new ArrayList<>();

    public Guia() {
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

    public ArrayList<Integer> getItinerariosId() {
        return ItinerariosId;
    }

    public void setItinerariosId(ArrayList<Integer> ItinerariosId) {
        this.ItinerariosId = ItinerariosId;
    }
    
    @Override
    public String ConcatenarString ()
    {
        String concatenacion = "";
        String listaItinerarios = "";
        
        for (int Itinerario:ItinerariosId)
        {
            listaItinerarios = String.valueOf(Itinerario) + "," + listaItinerarios;
        }
        
        concatenacion = "\n" + String.valueOf(Codigo) 
                + "\n" + String.valueOf(Nombre)
                + "\n" + String.valueOf(Direccion)
                + "\n" + String.valueOf(Telefono)
                + "\n" + String.valueOf(FechaIngreso)
                + "\n" + listaItinerarios;
        
        return concatenacion;
    } 
}
