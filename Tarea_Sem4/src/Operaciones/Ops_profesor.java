/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import java.util.ArrayList;
import Clases.Profesor;
/**
 *
 * 
 */
public class Ops_profesor {
    private ArrayList <Profesor> profesor = new ArrayList<Profesor>();
    
    //inserta en la ultima posicion
    public void insertar_profesor (Profesor nuevo) {
        this.profesor.add(nuevo);
    }
    
    //inserta en posicion especifica
    public void insertar_profesor_posicion (int posicion, Profesor nuevo) {
        this.profesor.add(posicion, nuevo);
    }
   
    public void remover_ultimo () {
        this.profesor.remove(this.profesor.size()-1);
    }
    
    public void remover_posicion (int posicion) {
        this.profesor.remove (posicion);
    }
    
    public void remover_elemento (Profesor Eliminiar) {
        this.profesor.remove (Eliminiar);
    }
    
    public void imprimir_array () 
    {
        System.out.printf ("\n************Lista de Profesores***************\n");
        for (Profesor temporal: this.profesor)
        {
            System.out.printf ("\n**************************************\n");
            System.out.printf("Nombre: %s\n",temporal.getNombre());
            System.out.printf("Edad: %d\n",temporal.getEdad());
            System.out.printf("Profesion: %s\n",temporal.getProfesion());
            System.out.printf("Identificacion: %d\n\n",temporal.getIdentificacion());     
            System.out.printf("Catedra: %s\n\n",temporal.getCatedra());   
        }
    }
}
