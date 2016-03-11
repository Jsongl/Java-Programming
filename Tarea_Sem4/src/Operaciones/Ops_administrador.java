/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import java.util.ArrayList;
import Clases.Administrativo;
/**
 *
 * @author leungure
 */
public class Ops_administrador 
{
     private ArrayList <Administrativo> administrador = new ArrayList<Administrativo>();
    
    //inserta en la ultima posicion
    public void insertar_administrador (Administrativo nuevo) {
        this.administrador.add(nuevo);
    }
    
    //inserta en posicion especifica
    public void insertar_administrador_posicion (int posicion, Administrativo nuevo) {
        this.administrador.add(posicion, nuevo);
    }
   
    public void remover_ultimo () {
        this.administrador.remove(this.administrador.size()-1);
    }
    
    public void remover_posicion (int posicion) {
        this.administrador.remove (posicion);
    }
    
    public void remover_elemento (Administrativo eliminar) {
        this.administrador.remove (eliminar);
    }
    
    public void imprimir_array () 
    {
        System.out.printf ("\n************Lista de Administradores***************\n");
        for (Administrativo temporal: this.administrador)
        {
            System.out.printf ("\n**************************************\n");
            System.out.printf("Nombre: %s\n",temporal.getNombre());
            System.out.printf("Edad: %d\n",temporal.getEdad());
            System.out.printf("Identificacion: %d\n\n",temporal.getIdentificacion());     
            System.out.printf("Catedra: %s\n\n",temporal.getCatedra());   
            System.out.printf("Extension: %s\n\n",temporal.getExtension());  
        }
    }
}
