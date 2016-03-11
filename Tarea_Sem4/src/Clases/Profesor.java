/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Programación
 */
public class Profesor {
    
    private String Nombre;
    private int Edad;
    private String Profesion;
    private int Identificacion;
    private String Catedra;

    public Profesor(String Nombre, int Edad, String Profesion, int Identificacion, String Catedra) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Profesion = Profesion;
        this.Identificacion = Identificacion;
        this.Catedra = Catedra;
    }
    
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }

    public int getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(int Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getCatedra() {
        return Catedra;
    }

    public void setCatedra(String Catedra) {
        this.Catedra = Catedra;
    }
    
    
    
}
