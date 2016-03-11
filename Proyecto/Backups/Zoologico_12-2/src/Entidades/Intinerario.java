/*  Clase para los intinerarios.
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



public class Intinerario {
    
    private int codigo;
    private int duracion; //Duracion en minutos
    private int longitud; //Longitud en metros
    private int maximoVisitantes; //Numero maximo de visitantes
    private int numeroEspecies; //Numero de especies que visita
    private ArrayList<Integer> zonasId = new ArrayList<>();

    public Intinerario() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getMaximoVisitantes() {
        return maximoVisitantes;
    }

    public void setMaximoVisitantes(int maximoVisitantes) {
        this.maximoVisitantes = maximoVisitantes;
    }

    public int getNumeroEspecies() {
        return numeroEspecies;
    }

    public void setNumeroEspecies(int numeroEspecies) {
        this.numeroEspecies = numeroEspecies;
    }

    public ArrayList<Integer> getZonasId() {
        return zonasId;
    }

    public void setZonasId(ArrayList<Integer> zonasId) {
        this.zonasId = zonasId;
    }
       
    public String ConcatenarString ()
    {
        String concatenacion = "";
        String listaZonas = "";
        
        for (int zona:zonasId)
        {
            listaZonas = String.valueOf(zona) + "," + listaZonas;
        }
        
        concatenacion = "\n" + String.valueOf(codigo) 
                + "\n" + String.valueOf(duracion)
                + "\n" + String.valueOf(longitud)
                + "\n" + String.valueOf(maximoVisitantes)
                + "\n" + String.valueOf(numeroEspecies)
                + "\n" + listaZonas;
        
        return concatenacion;
    } 
    
}

