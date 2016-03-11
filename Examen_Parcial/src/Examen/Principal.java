/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

import Examen.Fecha;
import Examen.Persona;
import Examen.ManejoPersonas;
import java.util.Scanner;


public class Principal {


    public static void main(String[] args) {
        
        ManejoPersonas obj1 = new ManejoPersonas ();
        
        //Carga de fecha Actual
        obj1.SolicitarFechaActual();
        
        //Carga de personas
        for (int i=1; i <=3; i++)
            obj1.SolicitarEmpleado();
        
        //Imprimir Lista
        obj1.ImprimirRegistros();
        
    }
    
}
