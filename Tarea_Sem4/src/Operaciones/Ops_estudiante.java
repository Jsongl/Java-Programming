/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import java.util.ArrayList;
import Clases.Estudiante;
/**
 *
 * 
 */
public class Ops_estudiante {
    private ArrayList <Estudiante> estudiante = new ArrayList<Estudiante>();
    
    //inserta en la ultima posicion
    public void insertar_estudiante (Estudiante nuevo) {
        this.estudiante.add(nuevo);
    }
    
    //inserta en posicion especifica
    public void insertar_estudiante_posicion (int posicion, Estudiante nuevo) {
        this.estudiante.add(posicion, nuevo);
    }
   
    public void remover_ultimo () {
        this.estudiante.remove(this.estudiante.size()-1);
    }
    
    public void remover_posicion (int posicion) {
        this.estudiante.remove (posicion);
    }
    
    public void remover_elemento (Estudiante eliminar) {
        this.estudiante.remove (eliminar);
    }
    
    public void imprimir_array () 
    {
        System.out.printf ("\n************Lista de Estudiantes***************\n");
        for (Estudiante temporal: this.estudiante)
        {
            System.out.printf ("\n**************************************\n");
            System.out.printf("Nombre: %s\n",temporal.getNombre());
            System.out.printf("Edad: %d\n",temporal.getEdad());
            System.out.printf("Carrera: %s\n",temporal.getCarrera());
            System.out.printf("Identificacion: %d\n\n",temporal.getIdentificacion());          
        }
    }
}
