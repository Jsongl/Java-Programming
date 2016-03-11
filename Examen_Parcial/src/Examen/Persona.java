/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

import Examen.Fecha;


public class Persona {

    private String Nombre;
    private String Apellidos;
    private Fecha FechaCumpleanos;
    private int cedula;
    private String Direccion;
    private String Profesion;
    private int SalarioMensual;

    public Persona() {
    }

    public Persona(String Nombre, String Apellidos, Fecha FechaCumpleanos, int cedula, String Direccion, String Profesion, int SalarioMensual) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.FechaCumpleanos = FechaCumpleanos;
        this.cedula = cedula;
        this.Direccion = Direccion;
        this.Profesion = Profesion;
        this.SalarioMensual = SalarioMensual;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public Fecha getFechaCumpleanos() {
        return FechaCumpleanos;
    }

    public void setFechaCumpleanos(Fecha FechaCumpleanos) {
        this.FechaCumpleanos = FechaCumpleanos;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }

    public int getSalarioMensual() {
        return SalarioMensual;
    }

    public void setSalarioMensual(int SalarioMensual) {
        this.SalarioMensual = SalarioMensual;
    }
    
    
    
}
