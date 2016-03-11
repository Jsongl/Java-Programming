/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana4;

public class Estudiante {
    private String nombre;
    private double parcial1;
    private double parcial2;
    private double Final;

    public Estudiante() {
    }
    
       
    public Estudiante(String nombre, double parcial1, double parcial2, double Final) {
        this.nombre = nombre;
        this.parcial1 = parcial1;
        this.parcial2 = parcial2;
        this.Final = Final;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getParcial1() {
        return parcial1;
    }

    public void setParcial1(double parcial1) {
        this.parcial1 = parcial1;
    }

    public double getParcial2() {
        return parcial2;
    }

    public void setParcial2(double parcial2) {
        this.parcial2 = parcial2;
    }

    public double getFinal() {
        return Final;
    }

    public void setFinal(double Final) {
        this.Final = Final;
    }


    
    
}
